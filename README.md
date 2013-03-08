UbiCollabSDK
============

One jar file to rule them all.

UbiCollabSDK is a library file that is used to access UbiCollab components on Android. You need to copy it to your libs folder. 

#Change log
##Version 0.4.2
* Fixes [#24](https://github.com/UbiCollab/UbiCollabSDK/issues/24).
* Fixes [#23](https://github.com/UbiCollab/UbiCollabSDK/issues/23). (was actually fixes in 0.4.1 but doc was not updated).
* Documentation updated. See [here](http://ubicollab.github.com/UbiCollabSDK/javadoc/).

##Version 0.4.1
* New: Added a new class SupportedAccountTypes to provide constant values for account types in sync adapters.
* Modified: SocialContract.ACCOUNT_TYPE_LOCAL is deprecated.

##Version 0.4.0
* Added a new field USER_NAME to People table.
* New: Use of dirty flag. DIRTY has to be set to 1 when a record in a DB is changed in order for synch adapter to sync it to the service. After a successful sync, DIRTY_FLAG is changed back to 0.
* Updated documentation for DIRTY and for USER_NAME

##Version 0.3.2
* No changes. Only synchronizing version number with UbiShare.

##Version 0.3.1:
* Added a new class ServiceConstants to SocialContract for providing constant values. Fixes #11. Fixes #16. Fixes #14.
* Updated javadoc to specify access mode, default values, DB type and constraints for all properties. Fixes #19. Fixes #15.
* Moved GLOBAL_ID, CREATION_DATE and LAST_MODIFIED_DATE to SyncColumns interface so now it is inherited by all sync-able classes. This eliminates repetitive documentation.
* Moved _ID to DBColumns interface. This eliminates repetitive documentation.
* Added _ID_PEOPLE 

##Version 0.3
* No changes. Only synchronizing version number with UbiShare.

##Version 0.2
* Add an interface SyncColumns for all sync-related columns. 
* Tag ORIGIN as deprecated. Use new fields from SyncColumns.
* Tag SYNC_STATUS as deprecated. Use new fields from SyncColumns.
* Add creation date and last modified to all that were missing.
* Change type for creation date and last modified date to integer.
* UriPathIndex and UriMatcherIndex are now protected.
* Rename actor, object, verb, target for all activity classes. Now they are correct.
* Update javadoc.