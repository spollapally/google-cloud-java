package com.google.cloud.bigtable.admin.v2;

import java.io.IOException;
import java.util.List;
import com.google.api.core.ApiFuture;
import com.google.bigtable.admin.v2.InstanceName;
import com.google.bigtable.admin.v2.ListTablesResponse;
import com.google.bigtable.admin.v2.ModifyColumnFamiliesRequest;
import com.google.bigtable.admin.v2.Table;
import com.google.bigtable.admin.v2.TableName;
import com.google.cloud.bigtable.admin.v2.models.TableAdminRequests;
import com.google.cloud.bigtable.admin.v2.models.TableAdminRequests.CreateTable;
import com.google.cloud.bigtable.admin.v2.models.TableAdminRequests.DeleteTable;
import com.google.cloud.bigtable.admin.v2.models.TableAdminRequests.GetTable;
import com.google.cloud.bigtable.admin.v2.models.TableAdminRequests.ModifyFamilies;
import com.google.cloud.bigtable.admin.v2.stub.BigtableTableAdminStub;
import com.google.cloud.bigtable.admin.v2.stub.BigtableTableAdminStubSettings;
import com.google.common.base.Preconditions;

public class TableAdminClient implements AutoCloseable {
  private final BigtableTableAdminStub stub;
  private final InstanceName instanceName;

  public static TableAdminClient create(InstanceName instanceName) throws IOException {
    return new TableAdminClient(instanceName);
  }

  public TableAdminClient(InstanceName instanceName) throws IOException {
    Preconditions.checkNotNull(instanceName);
    this.instanceName = instanceName;

    BigtableTableAdminSettings settings = BigtableTableAdminSettings.newBuilder().build();
    this.stub = ((BigtableTableAdminStubSettings) settings.getStubSettings()).createStub();
  }

  public BigtableTableAdminStub getTableAdminStub() {
    return stub;
  }

  public InstanceName getInstanceName() {
    return instanceName;
  }

  @Override
  public void close() throws Exception {
    stub.close();
  }

  public Table createTable(CreateTable createTable) {
    return this.stub.createTableCallable().call(createTable.toProto(instanceName.toString()));
  }

  public ApiFuture<Table> createTableAsync(CreateTable createTable) {
    return this.stub.createTableCallable().futureCall(createTable.toProto(instanceName.toString()));
  }

  public Table modifyFamilies(ModifyFamilies modifyFamily) {
    ModifyColumnFamiliesRequest modReq =
        modifyFamily.toProto(getUniqueTableName(modifyFamily.getTableId()));
    return this.stub.modifyColumnFamiliesCallable().call(modReq);
  }

  public ApiFuture<Table> modifyFamiliesAsync(ModifyFamilies modifyFamily) {
    ModifyColumnFamiliesRequest modReq =
        modifyFamily.toProto(getUniqueTableName(modifyFamily.getTableId()));
    return this.stub.modifyColumnFamiliesCallable().futureCall(modReq);
  }

  public void deleteTable(DeleteTable deleteTable) {
    this.stub.deleteTableCallable()
             .call(deleteTable.toProto(getUniqueTableName(deleteTable.getTableId())));
  }

  public void deleteTableAsync(DeleteTable deleteTable) {
    this.stub.deleteTableCallable()
             .futureCall(deleteTable.toProto(getUniqueTableName(deleteTable.getTableId())));
  }

  public Table getTable(GetTable getTable) {
    return this.stub.getTableCallable()
                    .call(getTable.toProto(getUniqueTableName(getTable.getTableId())));
  }

  public ApiFuture<Table> getTableAsync(GetTable getTable) {
    return this.stub.getTableCallable()
                    .futureCall(getTable.toProto(getUniqueTableName(getTable.getTableId())));
  }

  public List<Table> listTables() {
    ListTablesResponse listResp =
        this.stub.listTablesCallable()
                 .call(TableAdminRequests.listTables().toProto(instanceName.toString()));

    return listResp.getTablesList();
  }

  public ApiFuture<ListTablesResponse> listTablesAsync() {
    ApiFuture<ListTablesResponse> listResp =
        this.stub.listTablesCallable()
                 .futureCall(TableAdminRequests.listTables().toProto(instanceName.toString()));

    // TODO: convert response to a future of List<Table>
    return listResp;
  }

  private String getUniqueTableName(String tableId) {
    return TableName.of(instanceName.getProject(), instanceName.getInstance(), tableId).toString();
  }
}
