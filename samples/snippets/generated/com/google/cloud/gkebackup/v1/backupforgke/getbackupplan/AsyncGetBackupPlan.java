/*
 * Copyright 2022 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.google.cloud.gkebackup.v1.samples;

// [START gkebackup_v1_generated_BackupForGKE_GetBackupPlan_async]
import com.google.api.core.ApiFuture;
import com.google.cloud.gkebackup.v1.BackupForGKEClient;
import com.google.cloud.gkebackup.v1.BackupPlan;
import com.google.cloud.gkebackup.v1.BackupPlanName;
import com.google.cloud.gkebackup.v1.GetBackupPlanRequest;

public class AsyncGetBackupPlan {

  public static void main(String[] args) throws Exception {
    asyncGetBackupPlan();
  }

  public static void asyncGetBackupPlan() throws Exception {
    // This snippet has been automatically generated and should be regarded as a code template only.
    // It will require modifications to work:
    // - It may require correct/in-range values for request initialization.
    // - It may require specifying regional endpoints when creating the service client as shown in
    // https://cloud.google.com/java/docs/setup#configure_endpoints_for_the_client_library
    try (BackupForGKEClient backupForGKEClient = BackupForGKEClient.create()) {
      GetBackupPlanRequest request =
          GetBackupPlanRequest.newBuilder()
              .setName(BackupPlanName.of("[PROJECT]", "[LOCATION]", "[BACKUP_PLAN]").toString())
              .build();
      ApiFuture<BackupPlan> future = backupForGKEClient.getBackupPlanCallable().futureCall(request);
      // Do something.
      BackupPlan response = future.get();
    }
  }
}
// [END gkebackup_v1_generated_BackupForGKE_GetBackupPlan_async]
