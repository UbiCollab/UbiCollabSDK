/**
 * Copyright (c) 2011, SOCIETIES Consortium (WATERFORD INSTITUTE OF TECHNOLOGY (TSSG), HERIOT-WATT UNIVERSITY (HWU), SOLUTA.NET 
 * (SN), GERMAN AEROSPACE CENTRE (Deutsches Zentrum fuer Luft- und Raumfahrt e.V.) (DLR), Zavod za varnostne tehnologije
 * informacijske družbe in elektronsko poslovanje (SETCCE), INSTITUTE OF COMMUNICATION AND COMPUTER SYSTEMS (ICCS), LAKE
 * COMMUNICATIONS (LAKE), INTEL PERFORMANCE LEARNING SOLUTIONS LTD (INTEL), PORTUGAL TELECOM INOVAÇÃO, SA (PTIN), IBM Corp., 
 * INSTITUT TELECOM (ITSUD), AMITEC DIACHYTI EFYIA PLIROFORIKI KAI EPIKINONIES ETERIA PERIORISMENIS EFTHINIS (AMITEC), TELECOM 
 * ITALIA S.p.a.(TI),  TRIALOG (TRIALOG), Stiftelsen SINTEF (SINTEF), NEC EUROPE LTD (NEC))
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without modification, are permitted provided that the following
 * conditions are met:
 *
 * 1. Redistributions of source code must retain the above copyright notice, this list of conditions and the following disclaimer.
 *
 * 2. Redistributions in binary form must reproduce the above copyright notice, this list of conditions and the following
 *    disclaimer in the documentation and/or other materials provided with the distribution.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS" AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING,
 * BUT NOT LIMITED TO, THE IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE ARE DISCLAIMED. IN NO EVENT 
 * SHALL THE COPYRIGHT HOLDER OR CONTRIBUTORS BE LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR CONSEQUENTIAL
 * DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING
 * NEGLIGENCE OR OTHERWISE) ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF THE POSSIBILITY OF SUCH DAMAGE.
 */
package org.societies.android.api.cis;

import java.net.URL;

import android.net.Uri;

/**
 * <h1>Class SocialContract</h1>
 * Provides utility constant values for using SocialProvider.<br /><br /> 
 * 
 * Please read information about how to use content providers in Android 
 * in order to learn how to use this contract. You can start by
 * going into <a href="http://developer.android.com/guide/topics/providers/content-providers.html" target="_blank">this page</a> 
 * at Android developers site.
 * <br /><br /> 
 * 
 * Note that this contract is currently the only documentation
 * of {@link SocialProvider} on Android.
 * 
 * @author BabakFarshchian
 *
 */
/**
 * @author babak
 *
 */
public final class SocialContract {

	/**
	 * The URI for identifying the content provider.<br />
	 * <br />
	 */
	public static final String AUTHORITY_STRING = "content://org.societies.android.SocialProvider/";
	
    /**
     * The main authority, i.e. the base URI for all operations:
     */
    public static final Uri AUTHORITY = 
            Uri.parse("content://org.societies.android.SocialProvider");
    
    /**
     * A special account type used for fields that are not
     * supposed to be synchronized with a remote service.
     * See also {@link SynchColumns}. You can use this if 
     * you want to use the content provider for storing 
     * local data.
     * 
     */
    public static final String ACCOUNT_TYPE_LOCAL = "LOCAL";
    
    
    /**
     * When you add a new row to the content provider, its 
     * GLOBAL_ID can be set to GLOBAL_ID_PENDING. This 
     * means that the row is not yet synchronized with a remote
     * service. 
     * <br /><br />
     * If the row is synch-able the GLOBAL_ID has to be replaced
     * with a proper global ID upon a successful first sync.
     * If the row is private, the global ID will always 
     * be pending, i.e. it should not be used. This is the
     * case where ACCOUNT_TYPE is set to ACCOUNT_TYPE_LOCAL. 
     */
    public static final String GLOBAL_ID_PENDING = "PENDING";
    
    /**
     * A constant that is used to set the value for the optional
     * fields in case the user does not set them.
     */
    public static final String VALUE_NOT_DEFINED = "UNKNOWN";
    
    /**
     * Default date when setting default values in the DB. It is set
     * to the now.
     */
    public static final String DEFAULT_NOW_DATE = "(strftime('%s','now'))";
    
    /**
     * An optional insert, update or delete URI parameter that 
     * allows the caller to specify that it is a sync adapter.
     * <br />
     * <br />
     * The default value is false. 
     * <br /><br />
     * If set to true, the caller must also include 
     * ACCOUNT_NAME and ACCOUNT_TYPE as query parameters.
     * <br /><br />
     * This parameter is of interest only for synch adapter 
     * developers. See https://github.com/UbiCollab/UbiShare/issues/19.
     * 
     */
    public static final String CALLER_IS_SYNCADAPTER = "caller_is_syncadapter";
        
    /**
     * Constant used to define read permission for SocialProvider data:
     */
    public static final String PROVIDER_READ_PERMISSION = "org.societies.android.SocialProvider.READ";
    /**
     * Constant used to define write permission for SocialProvider data:
     */
    public static final String PROVIDER_WRITE_PERMISSION = "org.societies.android.SocialProvider.WRITE";
    
    
    /**
     * An internal utility class defining constants for the different 
	 * paths that are supported by the SocialProvider.<br />
	 * <br />
	 * 
	 * @author Babak Farshchian
	 *
	 */
	public static final class UriPathIndex{
		
		/**
		 * Path segment for searching for all my identities/user profiles.
		 */
		public static final String ME = "me";
		/**
		 * Same as me, replace # with the _ID of the identity/profile to
		 * get the exact identity/profile.
		 */
		public static final String ME_SHARP = "me/#";
		public static final String PEOPLE = "people";
		public static final String PEOPLE_SHARP = "people/#";
		public static final String COMMUNITIES = "communities";
		public static final String COMMUNITIES_SHARP = "communities/#";
		public static final String SERVICES = "services";
		public static final String SERVICES_SHARP = "services/#";
		public static final String RELATIONSHIP = "relationship";
		public static final String RELATIONSHIP_SHARP = "relationship/#";
		public static final String MEMBERSHIP = "membership";
		public static final String MEMBERSHIP_SHARP = "membership/#";
		public static final String SHARING = "sharing";
		public static final String SHARING_SHARP = "sharing/#";
		public static final String PEOPLE_ACTIVITIY = "people/activity";
		public static final String PEOPLE_ACTIVITIY_SHARP = "people/activity/#";
		public static final String COMMUNITY_ACTIVITIY = "communities/activity";
		public static final String COMMUNITY_ACTIVITIY_SHARP = "communities/activity/#";
		public static final String SERVICE_ACTIVITY = "services/activity";
		public static final String SERVICE_ACTIVITY_SHARP = "services/activity/#";
	}

	/**
	 * <h1>Class overview</h1> 
	 * Constants and helpers for operating on people.<br />
	 * <br />
	 * This is the URI you will use for accessing information about people.
	 * Every person who is accessible from {@link SocialProvider} and is
	 * considered to be of interest to the user has an
	 * entry in this table. You can search for people using id, 
	 * name etc.
	 * <br /><br />
	 * You can find information about both of the following:
	 * <ul>
	 * <li>People you have a relationship to. This means both of you use 
	 * some common service (e.g. Facebook) and have decided to be e.g.
	 * friends or followers etc.</li>
	 * <li>People you don't have a relationship to but want to keep
	 * informed about. This might be Obama or your neighbor. The information
	 * about this type of people will not be verifiable and will probably
	 * be very inaccurate. Depending on how it is synced.</li>
	 * </ul>
	 * Each row has a GLOBAL_ID that is set by the account which syncs
	 * the row. If the account is ACCOUNT_TYPE_LOCAL, the row will not be 
	 * synced with any service. For local rows GLOBAL_ID is always 
	 * GLOBAL_ID_PENDING. Also if you add a new row with account type
	 * e.g. "Facebook", the row will have GLOBAL ID set to
	 * GLOBAL_ID_PENDING until the first sync assigns a real "Facebook" ID. 
	 * This will happen if you for instance add a new user locally
	 * and want to synch it with a Facebook friend you already have.
	 * <br /><br />
	 * 
	 * 
	 * <h1>Insert</h1> 
	 * Applications can insert people by providing one or more of 
	 * the following when calling insert():
	 * <ul>
	 * <li>{@link GLOBAL_ID}
	 * <li>{@link NAME}
	 * <li>{@link DESCRIPTION}
	 * <li>{@link EMAIL}
	 * <li>{@link ACCOUNT_TYPE}
	 * <li>{@link ACCOUNT_NAME}
	 * </ul>
	 * Note that it is important to provide the ACCOUNT_TYPE and ACCOUNT_NAME 
	 * so that Syncing with services can update a new people record to 
	 * a real person if this is 
	 * needed. The value of the ACCOUNT_TYPE field depends on the target SyncAdapter.
	 * It might for instance be "Facebook". See proper SyncAdapter documentation.
	 * <br />
	 * If ACCOUNT_TYPE is set to ACCOUNT_TYPE_LOCAL the newly created person
	 * will not be updated by SyncAdapters. This can be used for building
	 * a private address book within People part of SocialProvider. In this case 
	 * the GLOBAL_ID is set to GLOBAL_ID_PENDING by default.
	 * <br /> 
	 * 
	 * 
	 * <h1>Update</h1> 
	 * Applications can update:
	 * <ul>
	 * <li>{@link GLOBAL_ID}
	 * <li>{@link NAME}
	 * <li>{@link DESCRIPTION}
	 * <li>{@link EMAIL}
	 * <li>{@link ACCOUNT_TYPE}
	 * <li>{@link ACCOUNT_NAME}
	 * <li>{@link LAST_MODIFIED_DATE}
	 * </ul>
	 * 
	 * Pay attention to ACCOUNT_TYPE.<br />
	 * 
	 * As long as ACCOUNT_TYPE is ACCOUNT_TYPE_LOCAL the record will not be Synced. This for 
	 * instance means that by changing the ACCOUNT_TYPE field from ACCOUNT_TYPE_LOCAL to e.g.
	 * "Facebook" the application can connect an existing private record to a
	 * friend of this user on Facebook. Or the opposite, changing ACCOUNT_TYPE 
	 * from "Facebook" to ACCOUNT_TYPE_LOCAL you can disconnect a record from a service.
	 * 
	 * SyncAdapters can update:
	 * <ul>
	 * <li>{@link GLOBAL_ID}
	 * <li>{@link NAME}
	 * <li>{@link EMAIL}
	 * </ul>
	 * SyncAdapters will only update people whose ACCOUNT_TYPE corresponds to the
	 * adapter. GLOBAL_ID will be updated in cases where ACCOUNT_TYPE is set to
	 * non-local and GLOBAL_ID is GLOBAL_ID_PENDING. Or when SyncAdapter discovers
	 * that the corresponding GLOBAL_ID does not exist anymore (e.g. a 
	 * Facebook user is deleted).
	 * 
	 * <h1>Delete</h1>
	 * Applications can delete people.<br />
	 * If a record with ACCOUNT_TYPE=ACCOUNT_TYPE_LOCAL is deleted it will be deleted
	 * permanently. Otherwise deletion is marked and later handled by
	 * the proper SyncAdapter.
	 * <br />
	 * SyncAdapters can delete people that have ACCOUNT_TYPE set to the 
	 * adapter and that are already marked for deletion by the user.
	 * 
	 * <h1>Query</h1>
	 * Applications can query for people using standard query URI or using _ID as
	 * the last part of the URI.
	 * 
	 * 
	 * @author Babak Farshchian
	 */
    public static final class People implements DBColumns, SyncColumns, BaseSyncColumns,
    RecommendationColumns{
        /**
         * The Uri to access the base table with all people.
         */
        public static final Uri CONTENT_URI = 
                    Uri.parse(AUTHORITY_STRING+ UriPathIndex.PEOPLE);
       /**
         * Name of the person.
         *  <br />
         * <ul>
         * <li>Access: Read-write.
         * <li>Default: {@link #VALUE_NOT_DEFINED}.
         * <li>Type in DB: text.
         * <li>DB constraint: not null.
         * </ul>
         */
        public static final String NAME = "name";
        /**
		 * A description of the person.
         *  <br />
         * <ul>
         * <li>Access: Read-write.
         * <li>Default: {@link #VALUE_NOT_DEFINED}.
         * <li>Type in DB: text.
         * <li>DB constraint: not null.
         * </ul>
         * </ul>
		 */
		public static final String DESCRIPTION = "description";
		/**
         * Email address of the person.
         *  <br />
         * <ul>
         * <li>Access: Read-write.
         * <li>Default: {@link #VALUE_NOT_DEFINED}.
         * <li>Type in DB: text.
         * <li>DB constraint: not null.
         * </ul>
         */
        public static final String EMAIL = "email";
        public static final String EMAIL2 = "email2";
        public static final String EMAIL3 = "email3";

		/**
         * Phone number for the person.
         *  <br />
         * <ul>
         * <li>Access: Read-write.
         * <li>Default: {@link #VALUE_NOT_DEFINED}.
         * <li>Type in DB: text.
         * <li>DB constraint: not null.
         * </ul>
         */
        public static final String PHONE = "phone";
        public static final String PHONE2 = "phone2";
        public static final String PHONE3 = "phone3";
		/**
         * Physical address of the person.
         *  <br />
         * <ul>
         * <li>Access: Read-write.
         * <li>Default: {@link #VALUE_NOT_DEFINED}.
         * <li>Type in DB: text.
         * <li>DB constraint: not null.
         * </ul>
         */
        public static final String ADDRESS = "address";

        @Deprecated
		public static final String ORIGIN = "origin";

        @Deprecated
        public static final String SYNC_STATUS = "sync_status";
        
    }
    
    /**
     * <h1>Class Communities</h1>
	 * <h1>Class overview</h1> 
	 * Constants and helpers for operating on communities.<br />
	 * <br />
	 * This is the URI you will use for accessing information about communities.
	 * Every community which is accessible from {@link SocialProvider} has an
	 * entry in this table. You can search for communities using GLOBAL_ID, name etc.
	 * You can find information about both of the following:
	 * <ul>
	 * <li>Communities you are a member of or own.</li>
	 * <li>All other communities that are registered in directories.</li>
	 * </ul>
	 * 
	 * You might have different levels of information for the different
	 * types of communities.
	 * 
	 * <h1>Insert</h1> 
	 * Applications can insert communities that will be confirmed
	 * by SyncAdapters. While confirmation pending,
	 *  {@link GLOBAL_ID} will be GLOBAL_ID_PENDING.
	 *  
	 * Applications will have to provide the following
	 * parameters in when inserting:
	 * <ul>
	 * <li>{@link GLOBAL_ID} (needed temporally until we have a working sync adapter)
	 * <li>{@link NAME}
	 * <li>{@link OWNER_ID}
	 * <li>{@link TYPE}
	 * <li>{@link DESCRIPTION} (optional)
	 * <li>{@link ACCOUNT_TYPE}
	 * </ul>
	 * 
	 * When an application inserts a community, {@link GLOBAL_ID} will be
	 * set to GLOBAL_ID_PENDING by {@link SocialProvider}. This has to be changed
	 * by a SyncAdapter upon next successful synchronization. The sync
	 * adapter then has to write the correct global_id. While a community
	 * is pending it will not accept membership or sharing of services.
	 * 
     *  <br />
	 * SyncAdapters cannot insert new communities.
	 * 
	 * <h1>Update</h1> 
	 * Applications can update:
	 * <ul>
	 * <li>{@link NAME}
	 * <li>{@link TYPE}
	 * <li>{@link DESCRIPTION}
	 * </ul>
	 * 
	 * SyncAdapters can update:
	 * <ul>
	 * <li>{@link NAME}
	 * <li>{@link TYPE}
	 * <li>{@link DESCRIPTION}
	 * </ul>
	 * 
	 * <h1>Delete</h1>
	 * Applications can delete communities. Only communities that belong to
	 * the logged-in user and that are empty can be deleted.
	 * <br />
	 * SyncAdapters can only delete communities that are marked for
	 * deletion. 
	 * <h1>Query</h1>
	 * Applications and SyncAdapters can query for communities using standard
	 * query URI or using _ID as the last part of the URI.
     * 
     * @author Babak Farshchian
     *
     */
    public static final class Communities implements DBColumns, SyncColumns, BaseSyncColumns,
    RecommendationColumns {
        /**
         * The Uri to access the base table with all communities. 
         */
        public static final Uri CONTENT_URI = 
                    Uri.parse(AUTHORITY_STRING+ UriPathIndex.COMMUNITIES);
        /**
         * Name of the community.
         *  <br />
         * <ul>
         * <li>Access: Read-write.
         * <li>Default: {@link #VALUE_NOT_DEFINED}.
         * <li>Type in DB: text.
         * <li>DB constraint: not null.
         * </ul>
         */
		public static final String NAME = "name";
		/**
		 * Global ID of the person who owns this community.
		 * <br /><br />
		 * Deprecated. Use _ID_OWNER and look up global ID in
		 * the People table.
         *  <br />
         * <ul>
         * <li>Access: Read-write.
         * <li>Default: {@link #VALUE_NOT_DEFINED}.
         * <li>Type in DB: text.
         * <li>DB constraint: not null.
         * </ul>
		 */
		@Deprecated
		public static final String OWNER_ID = "owner_id";
		/**
		 * _ID of the person who owns this community. Is used as foreign
		 * key to look up a row in the People table.
         *  <br />
         * <ul>
         * <li>Access: Read-write.
         * <li>Default: -1.
         * <li>Type in DB: integer.
         * <li>DB constraint: not null.
         * </ul>
		 */
		public static final String _ID_OWNER = "_id_owner";
		/**
         *  The type of the community being stored. E.g. "disaster".
         *  The type will be defined and used by applications.
         *  <br />
         * <ul>
         * <li>Access: Read-write.
         * <li>Default: {@link #VALUE_NOT_DEFINED}.
         * <li>Type in DB: text.
         * <li>DB constraint: not null.
         * </ul>
         */
        public static final String TYPE = "type";
        /**
		 * A user-provided description of the community.
         *  <br />
         * <ul>
         * <li>Access: Read-write.
         * <li>Default: {@link #VALUE_NOT_DEFINED}.
         * <li>Type in DB: text.
         * <li>DB constraint: not null.
         * </ul>
		 */
		public static final String DESCRIPTION = "description";

		@Deprecated
        public static final String ORIGIN = "origin";

        @Deprecated
        public static final String SYNC_STATUS = "sync_status";
        
    }
    
   /**
	 * <h1>Class overview</h1> 
	 * Constants and helpers for operating on services.<br />
	 * <br />
	 * This is the URI you will use for accessing information about services.
	 * Every service which is accessible from {@link SocialProvider} has an
	 * entry in this table. You can search for services using GLOBAL_ID, name etc.
	 * You can find information about both of the following:
	 * <ul>
	 * <li>Services you own.</li>
	 * <li>Other services, e.g. in a service market place.</li>
	 * </ul>
	 * 
	 * You might have different levels of information for the different
	 * types of services.
	 * 
	 * <h1>Insert</h1> 
	 * Applications can insert services. Applications will have to provide the following
	 * parameters when inserting services:
	 * <ul>
	 * <li>{@link GLOBAL_ID} (needed temporally until we have a working sync adapter)
	 * <li>{@link NAME}
	 * <li>{@link OWNER_ID}
	 * <li>{@link TYPE}
	 * <li>{@link DESCRIPTION} (optional, set to VALUE_NOT_DEFINED if not provided)
	 * <li>{@link APP_TYPE}
	 * <li>{@link ACCOUNT_TYPE}
	 * <li>{@link AVAILABLE}
	 * <li>{@link DEPENDENCY} (Optional, set to VALUE_NOT_DEFINED if not provided)
	 * <li>{@link CONFIG} (Optional, set to VALUE_NOT_DEFINED if not provided)
	 * <li>{@link URL} (Optional, set to VALUE_NOT_DEFINED if not provided)
	 * </ul>
	 * 
	 * When an application inserts a non-local row, GLOBAL_ID will be
	 * set to GLOBAL_ID_PENDING by {@link SocialProvider}. This has to be changed
	 * by a SyncAdapter upon next successful synchronization. A valid
	 * GLOBAL_ID has to be written back.
	 * 
	 * SyncAdapters can also insert services. SyncAdapters have to
	 * set the following parameters in the query in order to insert successfully:
	 * <ul>
	 * <li>{@link GLOBAL_ID}
	 * <li>{@link NAME}
	 * <li>{@link OWNER_ID}
	 * <li>{@link TYPE}
	 * <li>{@link DESCRIPTION} (optional, set to VALUE_NOT_DEFINED if not provided)
	 * <li>{@link APP_TYPE}
	 * <li>{@link ACCOUNT_TYPE}
	 * <li>{@link AVAILABLE}
	 * <li>{@link DEPENDENCY} (Optional, set to VALUE_NOT_DEFINED if not provided)
	 * <li>{@link CONFIG} (Optional, set to VALUE_NOT_DEFINED if not provided)
	 * <li>{@link URL} (Optional, set to VALUE_NOT_DEFINED if not provided)
	 * </ul>
	 * 
	 * <h1>Update</h1> 
	 * Applications can update:
	 * <ul>
	 * <li>{@link NAME}
	 * <li>{@link OWNER_ID}
	 * <li>{@link DESCRIPTION}
	 * <li>{@link ACCOUNT_TYPE}
	 * <li>{@link AVAILABLE}
	 * <li>{@link DEPENDENCY}
	 * <li>{@link CONFIG}
	 * <li>{@link URL}
	 * </ul>
	 * 
	 * SyncAdapters can update:
	 * <ul>
	 * <li>{@link NAME}
	 * <li>{@link OWNER_ID}
	 * <li>{@link DESCRIPTION}
	 * <li>{@link ACCOUNT_TYPE}
	 * <li>{@link AVAILABLE}
	 * <li>{@link DEPENDENCY}
	 * <li>{@link CONFIG}
	 * <li>{@link URL}
	 * </ul>
	 * 
	 * 
	 * <h1>Delete</h1>
	 * Applications can delete services. Only services that belong to
	 * the logged-in user can be deleted. A service can be deleted either
	 * by appending _ID to the end of the URI or via a standard query.<br />
	 * <br />
	 * SyncAdapters can delete services by either appending _ID to the
	 * end of the query URI or using a standard selection.
	 * 
	 * <h1>Query</h1>
	 * Applications and SyncAdapters can query for services using standard
	 * query URI or using _ID as the last part of the URI.
     * 
     * @author Babak Farshchian
     *
     */
    
    public static final class Services implements DBColumns, SyncColumns, BaseSyncColumns,
    RecommendationColumns{
        /**
         * Use this Uri to search in the content provider.
         */
        public static final Uri CONTENT_URI = 
                Uri.parse(AUTHORITY_STRING+ UriPathIndex.SERVICES);
        /**
		 *  User/provided name of the service, e.g. "iDisaster" or "iJacket".
         *  <br />
         * <ul>
         * <li>Access: Read-write.
         * <li>Default: {@link #VALUE_NOT_DEFINED}.
         * <li>Type in DB: text.
         * <li>DB constraint: not null.
         * </ul>
		 */
		public static final String NAME = "name";
		/**
		 * Global ID of the person who owns this service. This can be your own
		 * Global ID if you own the service, or someone else's global ID if 
		 * you find a service e.g. on a market place.
         *  <br />
         * Type: TEXT
		 */
		@Deprecated
		public static final String OWNER_ID = "owner_id";
		/**
		 * _ID of the person who owns this service. This can be your own
		 * _ID if you own the service, or someone else's _ID if 
		 * you find a service e.g. on a market place.
         *  <br />
         * <ul>
         * <li>Access: Read-write.
         * <li>Default: -1.
         * <li>Type in DB: integer.
         * <li>DB constraint: not null.
         * </ul>
		 */
		public static final String _ID_OWNER = "_id_owner";
		/**
         *  The type of the service being stored. This is a user-provided
         *  name, which can be the name given by the client application.
         *  E.g. iDisaster and other crisis management applications can
         *  assign TYPE to be "disaster".
         *  <br />
         * <ul>
         * <li>Access: Read-write.
         * <li>Default: {@link #VALUE_NOT_DEFINED}.
         * <li>Type in DB: text.
         * <li>DB constraint: not null.
         * </ul>
         */
        public static final String TYPE = "type";
        /**
		 * A user-provided description of the service.
         *  <br />
         *  <br />
         * <ul>
         * <li>Access: Read-write.
         * <li>Default: {@link #VALUE_NOT_DEFINED}.
         * <li>Type in DB: text.
         * <li>DB constraint: not null.
         * </ul>
		 */
		public static final String DESCRIPTION = "description";
		/**
         *  This is a parameter that can be used to define the technical
         *  type of the service. It can for instance be set to "android_application"
         *  or "virgo_service" etc.
         *  <br />
         * <ul>
         * <li>Access: Read-write.
         * <li>Default: {@link #VALUE_NOT_DEFINED}.
         * <li>Type in DB: text.
         * <li>DB constraint: not null.
         * </ul>
         */
        public static final String APP_TYPE = "app_type";
        @Deprecated
        public static final String ORIGIN = "origin";
        /**
		 * Tells whether this service is available on this device.
		 * E.g. if the service is available through an app installed on an 
		 * Android device then this parameter is set to "1". If this is a 
		 * cloud service accessible through e.g. a REST API this parameter
		 *  is set to "1". If this is an app that is not yet installed or it 
		 *  is a cloud service that is not available through a URI it is
		 *  set to "0".
		 * 
		 * Value needs to be set and kept updated by clients.
         *  <br />
         * <ul>
         * <li>Access: Read-write.
         * <li>Default: 0.
         * <li>Type in DB: integer.
         * <li>DB constraint: not null.
         * </ul>
		 */
		public static final String AVAILABLE = "available";
		/**
		 * A field telling whether this service depends on another 
		 * service to function. The value is the global ID of the
		 * other service or null.
         *  <br />
         * <ul>
         * <li>Access: Read-write.
         * <li>Default: {@link #VALUE_NOT_DEFINED}.
         * <li>Type in DB: text.
         * <li>DB constraint: not null.
         * </ul>
		 */
		public static final String DEPENDENCY = "dependency";
		/**
		 * String that contains the intent to be used to launch the service
		 * using Androdid intent mechanism.
         *  <br />
         * <ul>
         * <li>Access: Read-write.
         * <li>Default: {@link #VALUE_NOT_DEFINED}.
         * <li>Type in DB: text.
         * <li>DB constraint: not null.
         * </ul>
		 */
		public static final String CONFIG = "config";
		/**
		 * A URL to the code to be downloaded or to a web service interface.
		 * This can for instance be a link to an Android App.
         *  <br />
         * <ul>
         * <li>Access: Read-write.
         * <li>Default: {@link #VALUE_NOT_DEFINED}.
         * <li>Type in DB: text.
         * <li>DB constraint: not null.
         * </ul>
		 */
		public static final String URL = "url";

        @Deprecated
        public static final String SYNC_STATUS = "sync_status";
    }
    
    /**
     * <h1>Class Relationship</h1>
     * Class that provides information about relationships among
     * two people.<br /><br />
     *  If you want to know who is friends with whom or
     * who is following whom etc. use this.
     * 
 	 * <h1>Insert</h1> 
	 * Applications can insert relationships by providing the following:
	 * <ul>
	 * <li>{@link GLOBAL_ID} (needed temporally until we have a working sync adapter)
	 * <li>{@link GLOBAL_ID_P1}
	 * <li>{@link GLOBAL_ID_P2}
	 * <li>{@link TYPE}
	 * <li>{@link ACCOUNT_TYPE}
	 * </ul>
	 * 
	 * GLOBAL_ID_P1 and GLOBAL_ID_P2 have to exist among the user's People.<br/>
	 * 
	 * ORIGIN refers to the social service, e.g. "Facebook", and is used
	 * by SyncAdapters. ORIGIN can also be "private" which means it is
	 * stored only locally.<br/>
	 * 
	 * After a relationship is created by an application, its GLOBAL_ID
	 * is set to "pending" until a sync is performed.<br/>
	 * 
	 * SyncAdapters might also insert a relationship. GLOBAL_ID_P1 and 
	 * GLOBAL_ID_P2 have to exist among the user's People. The following
	 * should be set when a SyncAdapter inserts relationships:
	 * 
	 * <ul>
	 * <li>{@link GLOBAL_ID}
	 * <li>{@link GLOBAL_ID_P1}
	 * <li>{@link GLOBAL_ID_P2}
	 * <li>{@link TYPE}
	 * <li>{@link ORIGIN}
	 * </ul>
	 * 
	 * 
 	 * <h1>Update</h1>
 	 * Nothing can be updated for a relationship.
 	 * 
 	 * <h1>Query</h1>
 	 * 
 	 * All relationships fields can be used for querying.
 	 * 
 	 * <h1>Delete</h1>
 	 * An application can delete a relationship. The relationship will then
 	 * be labeled deleted but will not be removed until next sync. Relationships
 	 * with ORIGIN as "private" will be removed immediately.<br/>
 	 * 
 	 * SyncAdapters should delete relationships marked for deletion. They
 	 * should also delete relationships that are deleted by the
 	 * service. In this case the relationship's GLOBAL_ID will be set
 	 * to "pending" and its origin will be set to "private".
 	 *  
     * @author Babak dot Farshchian at sintef dot no
     *
     */
    public static final class Relationship implements DBColumns, SyncColumns, BaseSyncColumns{
        public static final Uri CONTENT_URI = 
                Uri.parse(AUTHORITY_STRING + UriPathIndex.RELATIONSHIP);

        /**
         * Use _ID_P1 instead.
         *  <br />
         *  <br />
         * Type: TEXT
         */
        @Deprecated
        public static final String GLOBAL_ID_P1 = "global_id_p1";
        /**
         * _ID for the first person in the relationship.
         *  <br />
         * <ul>
         * <li>Access: Read-write.
         * <li>Default: -1.
         * <li>Type in DB: integer.
         * <li>DB constraint: not null.
         * </ul>
         */
        public static final String _ID_P1 = "_id_p1";
        /**
         * Use _ID_P2 instead.
         *  <br />
         *  <br />
         * Type: TEXT
         */
        @Deprecated
        public static final String GLOBAL_ID_P2 = "global_id_p2";
        /**
         * _ID for the second person in the relationship.
         *  <br />
         * <ul>
         * <li>Access: Read-write.
         * <li>Default: -1.
         * <li>Type in DB: integer.
         * <li>DB constraint: not null.
         * </ul>
         */
        public static final String _ID_P2 = "_id_p2";
        /**
         * Type of the relationship. Can be e.g. friend, follower.
         *  <br />
         * <ul>
         * <li>Access: Read-write.
         * <li>Default: {@link #VALUE_NOT_DEFINED}.
         * <li>Type in DB: text.
         * <li>DB constraint: not null.
         * </ul>
         */
        public static final String TYPE = "type"; 
        
        /**
         * Application-provided description for this record.
         *  <br />
         * <ul>
         * <li>Access: Read-write.
         * <li>Default: {@link #VALUE_NOT_DEFINED}.
         * <li>Type in DB: text.
         * <li>DB constraint: not null.
         * </ul>
         */
        public static final String DESCRIPTION = "description"; 

        @Deprecated
        public static final String ORIGIN = "origin";
    }
    /**
     * <br />Constants and helpers for operating on memberships in
     * communities.<br />
	 * <br />
	 * This is the URI you will use for accessing information about who is
	 * member in which community. Every membership which is accessible from 
	 * this user's {@link SocialProvider} has an entry in this table. 
	 * You can find information about both of the following:
	 * <ul>
	 * <li>Which communities a user is a member of.</li>
	 * <li>Which members a community has.</li>
	 * <li>Which types of membership a user has in a community.</li>
	 * </ul>
	 * 
	 * You might have different levels of information for the different
	 * memberships based on your access rights to services that provide 
	 * this information.
	 * 
	 * <h1>Insert</h1> 
	 * Applications can insert memberships. Applications will have to provide the following
	 * parameters when inserting memberships:
	 * <ul>
	 * <li>{@link GLOBAL_ID} (needed temporally until we have a working sync adapter)
	 * <li>{@link GLOBAL_ID_MEMBER}
	 * <li>{@link GLOBAL_ID_COMMUNITY}
	 * <li>{@link TYPE}
	 * <li>{@link ACCOUNT_TYPE}
	 * </ul>
	 * 
	 * The membership will be created only if the member is among user's People and
	 * only when the communiy is among user's Communities. A pending community
	 * cannot accept membership. GLOBAL_ID of the membership is set to "pending" 
	 * until the next sync. ORIGIN is used by SyncAdapters to recognize the 
	 * relationship during the next sync.<br/>
	 * <br/>
	 * SyncAdapters can also insert memberships. SyncAdapters have to
	 * set the following parameters in the query in order to insert successfully:
	 * <ul>
	 * <li>{@link GLOBAL_ID}
	 * <li>{@link GLOBAL_ID_MEMBER}
	 * <li>{@link GLOBAL_ID_COMMUNITY}
	 * <li>{@link TYPE}
	 * <li>{@link ACCOUNT_TYPE}
	 * </ul>
	 * The membership will be inserted only if GLOBAL_ID_MEMBER is an ID of the 
	 * current user, or the user owns or is a member of GLOBAL_ID_COMMUNITY.
	 * 
	 * Memberships cannot exist privately, i.e. ORIGIN cannot be "private".
	 * 
	 * <h1>Update</h1> 
	 * Applications can update:
	 * <ul>
	 * <li>{@link TYPE}
	 * </ul>
	 * 
	 * SyncAdapters can update:
	 * <ul>
	 * <li>{@link TYPE}
	 * </ul>
	 * 
	 * 
	 * <h1>Delete</h1>
	 * Applications can delete memberships. A user (and his/her logged in 
	 * application) can delete the following memberships:
	 * <ul>
	 * <li>Memberships that involve the user.</li>
	 * <li>Memberships that involve communities where the user is owner.</li> 
	 * </ul>
	 * 
	 * <br />
	 * SyncAdapters can delete any membership.
	 * 
	 * <h1>Query</h1>
	 * Applications and SyncAdapters can query for memberships using standard
	 * query URI or using _ID as the last part of the URI.
     * 
     * 
     * @author Babak dot Farshchian at sintef dot no
     *
     */
    public static final class Membership implements DBColumns, SyncColumns, BaseSyncColumns{
        public static final Uri CONTENT_URI = 
                Uri.parse(AUTHORITY_STRING + UriPathIndex.MEMBERSHIP);

        /**
         * Deprecated. Use _ID_MEMBER and look up the member
         * in People table.
         * 
         *  <br />
         *  <br />
         * Type: TEXT
         */
        @Deprecated
        public static final String GLOBAL_ID_MEMBER = "global_id_member";
        /**
         * _ID for the member. Can be looked up in People table.
         * 
         *  <br />
         * <ul>
         * <li>Access: Read-write.
         * <li>Default: -1.
         * <li>Type in DB: integer.
         * <li>DB constraint: not null.
         * </ul>
         */
        public static final String _ID_MEMBER = "_id_member";
        /**
         * Deprecated. Use _ID_COMMUNITY and look up the community
         * in the Communities table.
         *  <br />
         *  <br />
         * Type: TEXT
         */
        @Deprecated
        public static final String GLOBAL_ID_COMMUNITY = "global_id_community";
        
        /**
         * _ID for the community. Can be looked up in Communities table.
         *  <br />
         * <ul>
         * <li>Access: Read-write.
         * <li>Default: -1.
         * <li>Type in DB: integer.
         * <li>DB constraint: not null.
         * </ul>
         * 
         */
        public static final String _ID_COMMUNITY = "_id_community";
        /**
         * Type of the membership. Application-defined. Can be used as
         * e.g. role in the community.
         *  <br />
         * <ul>
         * <li>Access: Read-write.
         * <li>Default: {@link #VALUE_NOT_DEFINED}.
         * <li>Type in DB: text.
         * <li>DB constraint: not null.
         * </ul>
         */
        public static final String TYPE = "type"; 
        /**
         * Application-provided description for this record.
         *  <br />
         * <ul>
         * <li>Access: Read-write.
         * <li>Default: {@link #VALUE_NOT_DEFINED}.
         * <li>Type in DB: text.
         * <li>DB constraint: not null.
         * </ul>
         */
        public static final String DESCRIPTION = "description"; 

        @Deprecated
        public static final String ORIGIN = "origin";
    }
    
    /**
     * <br />Constants and helpers for operating on sharing of services in
     * communities.<br />
	 * <br />
	 * This is the URI you will use for accessing information about what is
	 * shared in which community. Every sharing which is accessible from 
	 * this user's {@link SocialProvider} has an entry in this table. 
	 * You can find information about both of the following:
	 * <ul>
	 * <li>What is shared by this user in which community.</li>
	 * <li>What is shared by oher users in which community.</li>
	 * </ul>
	 * 
	 * 
	 * <h1>Insert</h1> 
	 * Applications can insert sharing. Applications will have to provide the following
	 * parameters when inserting memberships:
	 * <ul>
	 * <li>{@link GLOBAL_ID} (needed temporally until we have a working sync adapter)
	 * <li>{@link GLOBAL_ID_OWNER}
	 * <li>{@link GLOBAL_ID_SERVICE}
	 * <li>{@link GLOBAL_ID_COMMUNITY}
	 * <li>{@link TYPE}
	 * <li>{@link ACCOUNT_TYPE}
	 * </ul>
	 * 
	 * <br/>
	 * SyncAdapters can also insert memberships. SyncAdapters have to
	 * set the following parameters in the query in order to insert successfully:
	 * <ul>
	 * <li>{@link GLOBAL_ID}
	 * <li>{@link GLOBAL_ID_OWNER}
	 * <li>{@link GLOBAL_ID_SERVICE}
	 * <li>{@link GLOBAL_ID_COMMUNITY}
	 * <li>{@link TYPE}
	 * <li>{@link ACCOUNT_TYPE}
	 * </ul>
	 * <h1>Update</h1> 
	 * Applications can update:
	 * <ul>
	 * <li>{@link TYPE}
	 * </ul>
	 * 
	 * SyncAdapters can update:
	 * <ul>
	 * <li>{@link TYPE}
	 * </ul>
	 * 
	 * 
	 * <h1>Delete</h1>
	 * Applications can delete a sharing. A user (and his/her logged in 
	 * application) can delete the following sharings:
	 * <ul>
	 * <li>Sharings that involve the user.</li>
	 * <li>Sharings that involve communities where the user is owner.</li> 
	 * </ul>
	 * 
	 * <br />
	 * SyncAdapters can delete any sharing.
	 * 
	 * <h1>Query</h1>
	 * Applications and SyncAdapters can query for sharings using standard
	 * query URI or using _ID as the last part of the URI.
     * 
     * 
     * @author Babak dot Farshchian at sintef dot no
     *
     */
    public static final class Sharing implements DBColumns, SyncColumns, BaseSyncColumns{
        public static final Uri CONTENT_URI = 
                Uri.parse(AUTHORITY_STRING + UriPathIndex.SHARING);

        /**
         * Use _ID_SERVICE instead.
         *  <br />
         *  <br />
         * Type: TEXT
         */
        @Deprecated
        public static final String GLOBAL_ID_SERVICE = "global_id_service";
        /**
         * _ID for the service.
         *  <br />
         * <ul>
         * <li>Access: Read-write.
         * <li>Default: -1.
         * <li>Type in DB: integer.
         * <li>DB constraint: not null.
         * </ul>
         */
        public static final String _ID_SERVICE = "_id_service";
        /**
         * Use _ID_OWNER instead.
          *  <br />
         *  <br />
         * Type: TEXT
        */
        @Deprecated
        public static final String GLOBAL_ID_OWNER = "global_id_owner";
        /**
         * _ID for the owner. Can be looked up in People table.
          *  <br />
         * <ul>
         * <li>Access: Read-write.
         * <li>Default: -1.
         * <li>Type in DB: integer.
         * <li>DB constraint: not null.
         * </ul>
        */
        public static final String _ID_OWNER = "_id_owner";
        /**
         * Use ID_COMMUNITY instead.
          *  <br />
         *  <br />
         * Type: TEXT
        */
        @Deprecated
        public static final String GLOBAL_ID_COMMUNITY = "global_id_community";
        /**
         * _ID for the community.
          *  <br />
         * <ul>
         * <li>Access: Read-write.
         * <li>Default: -1.
         * <li>Type in DB: integer.
         * <li>DB constraint: not null.
         * </ul>
        */
        public static final String _ID_COMMUNITY = "_id_community";
        /**
         * Type of the sharing. Application-defined.
          *  <br />
         * <ul>
         * <li>Access: Read-write.
         * <li>Default: {@link #VALUE_NOT_DEFINED}.
         * <li>Type in DB: text.
         * <li>DB constraint: not null.
         * </ul>
        */
        public static final String TYPE = "type"; 
        /**
         * Application-provided description for this record.
         *  <br />
         * <ul>
         * <li>Access: Read-write.
         * <li>Default: {@link #VALUE_NOT_DEFINED}.
         * <li>Type in DB: text.
         * <li>DB constraint: not null.
         * </ul>
         */
        public static final String DESCRIPTION = "description"; 

        @Deprecated
        public static final String ORIGIN = "origin";
    }
    
    /**
     * Represents a table containing all the activities that are 
     * added to the activity feeds for people. You can search 
     * the table using a specific user's global ID as feed owner 
     * ID.
     * <h1>Insert</h1> 
	 * Applications can insert activities. Applications will have to provide the following
	 * parameters when inserting activities:
	 * <ul>
	 * <li>{@link GLOBAL_ID} (needed temporally until we have a working sync adapter)
	 * <li>{@link GLOBAL_ID_FEED_OWNER}
	 * <li>{@link GLOBAL_ID_ACTOR}
	 * <li>{@link GLOBAL_ID_OBJECT}
	 * <li>{@link GLOBAL_ID_VERB}
	 * <li>{@link GLOBAL_ID_TARGET}
	 * <li>{@link ACCOUNT_TYPE}
	 * </ul>
	 * 
     * @author Babak dot Farshchian at sintef dot no
     *
     */
    public static final class PeopleActivity implements DBColumns, SyncColumns, BaseSyncColumns,
    RecommendationColumns{
	    public static final Uri CONTENT_URI = 
	            Uri.parse(AUTHORITY_STRING + UriPathIndex.PEOPLE_ACTIVITIY);
        /**
         * Global ID for the owner of the feed where the
         * activity is added. Has to identify a record in
         * People.
         *  <br />
         *  <br />
         * Type: TEXT
         */
        @Deprecated
        public static final String GLOBAL_ID_FEED_OWNER = "global_id_feed_owner";
        /**
         * _ID for the owner of the feed where the
         * activity is added. Identifies a record in
         * People table.
         *  <br />
         * <ul>
         * <li>Access: Read-write.
         * <li>Default: -1.
         * <li>Type in DB: integer.
         * <li>DB constraint: not null.
         * </ul>
         */
        public static final String _ID_FEED_OWNER = "_id_feed_owner";
        /**
         * Actor of the activity. This can be the global ID of the
         * person or service or community that created this activity.
         * <br />
         * <ul>
         * <li>Access: Read-write.
         * <li>Default: {@link #VALUE_NOT_DEFINED}.
         * <li>Type in DB: text.
         * <li>DB constraint: not null.
         * </ul>
         */
        public static final String ACTOR = "actor";
        /**
         * Object of the activity.
         * <br />
         * <ul>
         * <li>Access: Read-write.
         * <li>Default: {@link #VALUE_NOT_DEFINED}.
         * <li>Type in DB: text.
         * <li>DB constraint: not null.
         * </ul>
         */
        public static final String OBJECT = "object";
        /**
         * Verb of the activity.
         * <br />
         * <ul>
         * <li>Access: Read-write.
         * <li>Default: {@link #VALUE_NOT_DEFINED}.
         * <li>Type in DB: text.
         * <li>DB constraint: not null.
         * </ul>
         */
        public static final String VERB = "verb";
        /**
         * Target of the activity.
         * <br />
         * <ul>
         * <li>Access: Read-write.
         * <li>Default: {@link #VALUE_NOT_DEFINED}.
         * <li>Type in DB: text.
         * <li>DB constraint: not null.
         * </ul>
         */
        public static final String TARGET = "target";
        @Deprecated
        public static final String ORIGIN = "origin";	

        @Deprecated
        public static final String SYNC_STATUS = "sync_status";
        

    	
    }
    /**
     * Represents a table containing all the activities that are 
     * added to the activity feeds for communities. You can search 
     * the table using a specific community's global ID as feed owner 
     * ID.
     * 
     * @author Babak dot Farshchian at sintef dot no
     *
     */
    public static final class CommunityActivity implements DBColumns, SyncColumns, BaseSyncColumns,
    RecommendationColumns{
	    public static final Uri CONTENT_URI = 
	            Uri.parse(AUTHORITY_STRING + UriPathIndex.COMMUNITY_ACTIVITIY);
        /**
         * Global ID for the owner community of the feed where the
         * activity is added.
         * 
         * @deprecated 
         * 
         * Use _ID_FEED_OWNER instead and look up the 
         * global ID in the Community table.
         *  <br />
         *  <br />
         * Type: TEXT
         */
        @Deprecated
        public static final String GLOBAL_ID_FEED_OWNER = "global_id_feed_owner";
        /**
         * Global ID for the owner community of the feed where the
         * activity is added.
         * 
         *  <br />
         * <ul>
         * <li>Access: Read-write.
         * <li>Default: -1.
         * <li>Type in DB: integer.
         * <li>DB constraint: not null.
         * </ul>
         */
        public static final String _ID_FEED_OWNER = "_id_feed_owner";
        /**
         * Actor of the activity. This can be the global ID of the
         * person or service or community that created this activity.
         * <br />
         * Type: TEXT
         */
        public static final String ACTOR = "actor";
        /**
         * Object of the activity.
         * <br />
         * <ul>
         * <li>Access: Read-write.
         * <li>Default: {@link #VALUE_NOT_DEFINED}.
         * <li>Type in DB: text.
         * <li>DB constraint: not null.
         * </ul>
         */
        public static final String OBJECT = "object";
        /**
         * Verb of the activity.
         * <br />
         * <ul>
         * <li>Access: Read-write.
         * <li>Default: {@link #VALUE_NOT_DEFINED}.
         * <li>Type in DB: text.
         * <li>DB constraint: not null.
         * </ul>
         */
        public static final String VERB = "verb";
        /**
         * Target of the activity.
         * <br />
         * <ul>
         * <li>Access: Read-write.
         * <li>Default: {@link #VALUE_NOT_DEFINED}.
         * <li>Type in DB: text.
         * <li>DB constraint: not null.
         * </ul>
         */
        public static final String TARGET = "target";
        @Deprecated
        public static final String ORIGIN = "origin";	

        @Deprecated
        public static final String SYNC_STATUS = "sync_status";
    }
    /**
     * Represents a table containing all the activities that are 
     * added to the activity feeds for services. You can search 
     * the table using a specific service's global ID as feed owner 
     * ID.
     * 
     * @author Babak dot Farshchian at sintef dot no
     *
     */
    public static final class ServiceActivity implements DBColumns, SyncColumns, BaseSyncColumns,
    RecommendationColumns{
	    public static final Uri CONTENT_URI = 
	            Uri.parse(AUTHORITY_STRING + UriPathIndex.SERVICE_ACTIVITY);
        /**
         * Use _ID_FEED_OWNER instead.
         *  <br />
         *  <br />
         * Type: TEXT
         */
        @Deprecated
        public static final String GLOBAL_ID_FEED_OWNER = "global_id_feed_owner";
        /**
         * _ID for the owner service of the feed where the
         * activity is added. Can be looked up in Services table.
         *  <br />
         * <ul>
         * <li>Access: Read-write.
         * <li>Default: -1.
         * <li>Type in DB: integer.
         * <li>DB constraint: not null.
         * </ul>
         */
        public static final String _ID_FEED_OWNER = "_id_feed_owner";
        /**
         * Actor of the activity. This can be the global ID of the
         * person or service or community that created this activity.
         * <br />
         * <ul>
         * <li>Access: Read-write.
         * <li>Default: {@link #VALUE_NOT_DEFINED}.
         * <li>Type in DB: text.
         * <li>DB constraint: not null.
         * </ul>
         */
        public static final String ACTOR = "actor";
        /**
         * Object of the activity.
         * <br />
         * <ul>
         * <li>Access: Read-write.
         * <li>Default: {@link #VALUE_NOT_DEFINED}.
         * <li>Type in DB: text.
         * <li>DB constraint: not null.
         * </ul>
         */
        public static final String OBJECT = "object";
        /**
         * Verb of the activity.
         * <br />
         * <ul>
         * <li>Access: Read-write.
         * <li>Default: {@link #VALUE_NOT_DEFINED}.
         * <li>Type in DB: text.
         * <li>DB constraint: not null.
         * </ul>
         */
        public static final String VERB = "verb";
        /**
         * Target of the activity.
         * <br />
         * <ul>
         * <li>Access: Read-write.
         * <li>Default: {@link #VALUE_NOT_DEFINED}.
         * <li>Type in DB: text.
         * <li>DB constraint: not null.
         * </ul>
         */
        public static final String TARGET = "target";
        @Deprecated
        public static final String ORIGIN = "origin";	

        @Deprecated
        public static final String SYNC_STATUS = "sync_status";
    }

    /**
	 * Class that provides information about the owner of 
	 * the current device. This is mainly information that will
	 * be extracted from CSS Manager Light. Note that you can have 
	 * as many CSS IDs as you wish.
	 * 
	 * <h1>Class overview</h1> 
	 * Constants and helpers for operating on own identities and profiles.<br />
	 * <br />
	 * This is the URI you will use for creating and managing your identity and 
	 * profile information. You can do the following:
	 * <ul>
	 * <li>Store information about various identities, user name/passwords, and profile
	 * data about yourself.</li>
	 * <li>Query this information.</li>
	 * </ul>
	 * The information here is normally not synchronized with cloud services since 
	 * it might include private information.
	 * 
	 * <h1>Insert</h1> 
	 * Applications can create new identities as records under /Me. SyncAdapters 
	 * will not be able to sync this data.<br />
	 * <br />
	 * The following parameters are needed when inserting:
	 * <ul>
	 * <li>{@link GLOBAL_ID}
	 * <li>{@link NAME}
	 * <li>{@link DISPLAY_NAME} (Optional, set to "NA" if not provided)
	 * <li>{@link USER_NAME}
	 * <li>{@link PASSWORD}
	 * <li>{@link ACCOUNT_TYPE}
	 * </ul>
	 *  
	 * <h1>Update</h1> 
	 * Applications can update:
	 * <ul>
	 * <li>{@link GLOBAL_ID}
	 * <li>{@link NAME}
	 * <li>{@link DISPLAY_NAME}
	 * <li>{@link USER_NAME}
	 * <li>{@link PASSWORD}
	 * <li>{@link ACCOUNT_TYPE}
	 * </ul>
	 * 
	 * <h1>Delete</h1>
	 * Applications can delete any record under Me.<br />
	 * <br />
	 * 
	 * <h1>Query</h1>
	 * Applications can query for identities/profiles using standard 
	 * query URI or using _ID as the last part of the URI.
	 * 
	 * @author Babak dot Farshchian at sintef dot no
	 *
	 */
	public static final class Me implements DBColumns, SyncColumns, BaseSyncColumns{
	    public static final Uri CONTENT_URI = 
	            Uri.parse(AUTHORITY_STRING + UriPathIndex.ME);
	
	    /**
	     * A foreign key to connect account to a row in the People
	     * table. E.g. if a user has registered a Box account in Me
	     * information about the user can be looked up using this 
	     * value.
         *  <br />
         * <ul>
         * <li>Access: Read-write.
         * <li>Default: -1.
         * <li>Type in DB: integer.
         * <li>DB constraint: not null.
         * </ul> 
	     */
	    public static final String _ID_PEOPLE = "_id_people";
	    /**
	     * My name to be used with this ID.
         *  <br />
         * <ul>
         * <li>Access: Read-write.
         * <li>Default: {@link #VALUE_NOT_DEFINED}.
         * <li>Type in DB: text.
         * <li>DB constraint: not null.
         * </ul>
	     */
	    public static final String NAME = "name"; 
	    /**
	     *  My alternative name, e.g. nickname.
         *  <br />
         * <ul>
         * <li>Access: Read-write.
         * <li>Default: {@link #VALUE_NOT_DEFINED}.
         * <li>Type in DB: text.
         * <li>DB constraint: not null.
         * </ul>
	     */
	    public static final String DISPLAY_NAME = "display_name";
	    /**
	     *  Login user name.
         *  <br />
         * <ul>
         * <li>Access: Read-write.
         * <li>Default: {@link #VALUE_NOT_DEFINED}.
         * <li>Type in DB: text.
         * <li>DB constraint: not null.
         * </ul>
	     */
	    public static final String USER_NAME = "user_name";
	    /**
	     *  Possible password or token to be used with user name
	     *  for logging in to the service.
         *  <br />
         * <ul>
         * <li>Access: Read-write.
         * <li>Default: {@link #VALUE_NOT_DEFINED}.
         * <li>Type in DB: text.
         * <li>DB constraint: not null.
         * </ul>
	     */
	    public static final String PASSWORD = "password";

	    @Deprecated
	    public static final String ORIGIN = "origin";
	}

	
	/**
	 * A utility class defining constants for UriMatcher in the 
	 * content provider and for using in case/switch sentences.
	 * @author Babak dot Farshchian at sintef dot no
	 *
	 */
	public static final class UriMatcherIndex{
		public static final int ME = 1;
		public static final int ME_SHARP = 2;
		public static final int PEOPLE = 3;
		public static final int PEOPLE_SHARP = 4;
		public static final int COMMUNITIES = 5;
		public static final int COMMUNITIES_SHARP = 6;
		public static final int SERVICES = 7;
		public static final int SERVICES_SHARP = 8;
		public static final int RELATIONSHIP = 9;
		public static final int RELATIONSHIP_SHARP = 10;
		public static final int MEMBERSHIP = 11;
		public static final int MEMBERSHIP_SHARP = 12;
		public static final int SHARING = 13;
		public static final int SHARING_SHARP = 14;
		public static final int PEOPLE_ACTIVITY = 15;
		public static final int PEOPLE_ACTIVITY_SHARP = 16;
		public static final int COMMUNITY_ACTIVITIY = 17;
		public static final int COMMUNITY_ACTIVITIY_SHARP = 18;
		public static final int SERVICE_ACTIVITY = 19;
		public static final int SERVICE_ACTIVITY_SHARP = 20;

	}
 
	/**
	 * These columns are used by Sync Adapters to synchronize 
	 * database content. Their use needs to be consistent by
	 * apps and sync adapters.
	 * 
	 * Note: This interface is based on Android class CalendarContract.
	 * 
	 * @author Babak Farshchian
	 *
	 */
	public interface SyncColumns{
        /**
         * ID which globally identifies this record. It is typically service-specific
         * and can be e.g. a Facebook ID, a Jabber ID etc. It is identifiable
         * by the specific service that i providing the ID.
         * 
         * <ul>
         * <li>Access: Read-write.
         * <li>Default: {@link GLOBAL_ID_PENDING}.
         * <li>Type in DB: text.
         * <li>DB constraint: not null.
         * </ul>
         */
        public static final String GLOBAL_ID = "global_id";
		/**
		 * The name of the account that is used to 
		 * sync the record.
		 * <br />
         * <ul>
         * <li>Access: Read-write.
         * <li>Default: {@link #VALUE_NOT_DEFINED}.
         * <li>Type in DB: text.
         * <li>DB constraint: not null.
         * </ul>
		 */
		public static final String ACCOUNT_NAME ="account_name";
		/**
		 * The type of the account that is used to sync the record.
		 * Set this to {@link ACCOUNT_TYPE_LOCAL} if the field is 
		 * not to be synced by a sync adapter.
		 * <br />
         * <ul>
         * <li>Access: Read-write.
         * <li>Default: {@link ACCOUNT_TYPE_LOCAL}.
         * <li>Type in DB: text.
         * <li>DB constraint: not null.
         * </ul>
		 */
		public static final String ACCOUNT_TYPE ="account_type";
		
		/**
		 * Used to tell whether the row is deleted but not 
		 * synced. Set to 1 if you delete row locally in an app.
		 * Set to 0 when synced successful in a sync adapter.
		 * <br />
         * <ul>
         * <li>Access: Read-write.
         * <li>Default: 0.
         * <li>Type in DB: integer.
         * <li>DB constraint: not null.
         * </ul>
		 */
		public static final String DELETED = "deleted"; 
		/**
		* Used to indicate that local, unsynced, changes are present.
		* 1 means the row has local modifications that are not yet
		* synced by sync adapter. Set to 0 in sync adapter after
		* a successful sync operation.
		* <br />
         * <li>Access: Read-write.
         * <li>Default: 0.
         * <li>Type in DB: integer.
         * <li>DB constraint: not null.
         * </ul>
		*/
		public static final String DIRTY = "dirty";
		/**
         * The date this record was created.
         *  <br />
         * <ul>
         * <li>Access: Read-write.
         * <li>Default: {@link DEFAULT_NOW_DATE}.
         * <li>Type in DB: integer.
         * <li>DB constraint: not null.
         * </ul>
         */
        public static final String CREATION_DATE = "creation_date";
        
        /**
         * The date this record was last modified.
         *  <br />
         * <ul>
         * <li>Access: Read-write.
         * <li>Default: {@link DEFAULT_NOW_DATE}.
         * <li>Type in DB: integer.
         * <li>DB constraint: not null.
         * </ul>
         */
        public static final String LAST_MODIFIED_DATE = "last_modified_date";
	}

		/**
		 * These columns are privately used by sync adapters
		 * and should not be used by applications. Sync adapters
		 * can choose to use them in any way they want.
		 * 
		 * Note: This interface is based on Android class CalendarContract.
		 * 
		 * @author Babak Farshchian
		 *
		 */
	public interface BaseSyncColumns{
		/**
		 * Generic column for use by sync adapters.
		 * <br />
         * <ul>
         * <li>Access: Read-write.
         * <li>Default: {@link #VALUE_NOT_DEFINED}.
         * <li>Type in DB: text.
         * <li>DB constraint: not null.
         * </ul>
		 */
		public static final String SYNC1 ="sync1";
		/**
		 * Generic column for use by sync adapters.
		 * <br />
         * <ul>
         * <li>Access: Read-write.
         * <li>Default: {@link #VALUE_NOT_DEFINED}.
         * <li>Type in DB: text.
         * <li>DB constraint: not null.
         * </ul>
		 */
		public static final String SYNC2 ="sync2";
		/**
		 * Generic column for use by sync adapters.
		 * <br />
         * <ul>
         * <li>Access: Read-write.
         * <li>Default: {@link #VALUE_NOT_DEFINED}.
         * <li>Type in DB: text.
         * <li>DB constraint: not null.
         * </ul>
		 */
		public static final String  SYNC3 = "sync3";
		/**
		 * Generic column for use by sync adapters.
		 * <br />
         * <ul>
         * <li>Access: Read-write.
         * <li>Default: -1.
         * <li>Type in DB: integer.
         * <li>DB constraint: not null.
         * </ul>
		 */
		public static final String  SYNC4 = "sync4";
		/**
		 * Generic column for use by sync adapters.
		 * <br />
         * <ul>
         * <li>Access: Read-write.
         * <li>Default: -1.
         * <li>Type in DB: integer.
         * <li>DB constraint: not null.
         * </ul>
		 */
		public static final String  SYNC5 = "sync5";
		/**
		 * Generic column for use by sync adapters.
		 * <br />
         * <ul>
         * <li>Access: Read-write.
         * <li>Default: -1.
         * <li>Type in DB: integer.
         * <li>DB constraint: not null.
         * </ul>
		 */
		public static final String  SYNC6 = "sync6";
	}
	/**
	 * These columns can be used by services to set data 
	 * related to how they want to recommend various 
	 * data types to the user.
	 * 
	 * @author Babak Farshchian
	 *
	 */
	public interface RecommendationColumns{
		/**
		 * An integer 0-100 that gives an indication of how
		 * relevant the current row is for the user.
		 * <br />
         * <ul>
         * <li>Access: Read-write.
         * <li>Default: -1.
         * <li>Type in DB: integer.
         * <li>DB constraint: not null.
         * </ul>
		 */
		public static final String  RELEVANCE = "relevance";
	}
	
	/**
	 * Helper class for defining constants to use with services.
	 * Used by applications.
	 * 
	 * @author Babak Farshchian
	 *
	 */
	public interface DBColumns{
        /**
         *  Key local ID, used by content provider to denote the location of this
         *  record in the table. Row number in the table. Set by Android.
         *  <br />
         * <ul>
         * <li>Access: Read-only.
         * <li>Default: Row number in table. Auto-increment
         * <li>Type in DB: integer.
         * </ul>
         */
        public static final String _ID = "_id";

	}
	public static final class ServiceConstants {
	    /**
	     * App that provides a service - can be shared in a Community
	     */
	    public final String SERVICE_TYPE_PROVIDER = "Provider";

	    /**
	     * App that is a service client - cannot be shared in a Community
	     */
	    public final String SERVICE_TYPE_CLIENT = "Client";

	    /**
	     * App that is an an extension to a SocialProvider (e.g. UI extension)
	     * - cannot be shared in a Community
	     */
	    public final String SERVICE_TYPE_APP = "App";
	 // Constant used for services in a community
	    public final String SERVICE_RECOMMENDED = "RECOMMENDED";
	    public final String SERVICE_SHARED = "SHARED";
	    public final String SERVICE_INSTALLED = "INSTALLED";
	    public final String SERVICE_NOT_INSTALLED = "NOT_INSTALLED";

	}
}


