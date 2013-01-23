API
===

One jar file to rule them all.

Change log
===
Version 0.3.1:
* Added a new class ServiceConstants to SocialContract for providing constant values. Fixes #11. Fixes #16. Fixes #14.
* Updated javadoc to specify access mode, default values, DB type and constraints for all properties. Fixes #19. Fixes #15.
* Moved GLOBAL_ID, CREATION_DATE and LAST_MODIFIED_DATE to SyncColumns interface so now it is inherited by all sync-able classes. This eliminates repetitive documentation.
* Moved _ID to DBColumns interface. This eliminates repetitive documentation.
* Added _ID_PEOPLE 

Version 0.3
* No changes. Only synchronizing version number with UbiShare.
Version 0.2
* Add an interface SyncColumns for all sync-related columns. 
* Tag ORIGIN as deprecated. Use new fields from SyncColumns.
* Tag SYNC_STATUS as deprecated. Use new fields from SyncColumns.
* Add creation date and last modified to all that were missing.
* Change type for creation date and last modified date to integer.
* UriPathIndex and UriMatcherIndex are now protected.
* Rename actor, object, verb, target for all activity classes. Now they are correct.
* Update javadoc.