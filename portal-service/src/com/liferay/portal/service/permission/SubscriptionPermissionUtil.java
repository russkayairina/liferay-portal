/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.liferay.portal.service.permission;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.security.pacl.permission.PortalRuntimePermission;
import com.liferay.portal.security.permission.PermissionChecker;

/**
 * Provides the utility for SubscriptionPermission. Retrieves and checks
 * permissions with respect to subscriptions.
 *
 * @author Mate Thurzo
 * @author Raymond Augé
 * @see    SubscriptionPermission
 */
public class SubscriptionPermissionUtil {

	/**
	 * @see SubscriptionPermission#check(PermissionChecker, String, long,
	 *      String, long)
	 */
	public static void check(
			PermissionChecker permissionChecker, String subscriptionClassName,
			long subscriptionClassPK, String inferredClassName,
			long inferredClassPK)
		throws PortalException, SystemException {

		getSubscriptionPermission().check(
			permissionChecker, subscriptionClassName, subscriptionClassPK,
			inferredClassName, inferredClassPK);
	}

	/**
	 * @see SubscriptionPermission#contains(PermissionChecker, String, long,
	 *      String, long)
	 */
	public static boolean contains(
			PermissionChecker permissionChecker, String subscriptionClassName,
			long subscriptionClassPK, String inferredClassName,
			long inferredClassPK)
		throws PortalException, SystemException {

		return getSubscriptionPermission().contains(
			permissionChecker, subscriptionClassName, subscriptionClassPK,
			inferredClassName, inferredClassPK);
	}

	public static SubscriptionPermission getSubscriptionPermission() {
		PortalRuntimePermission.checkGetBeanProperty(
			SubscriptionPermissionUtil.class);

		return _subscriptionPermission;
	}

	public void setSubscriptionPermission(
		SubscriptionPermission subscriptionPermission) {

		PortalRuntimePermission.checkSetBeanProperty(getClass());

		_subscriptionPermission = subscriptionPermission;
	}

	private static SubscriptionPermission _subscriptionPermission;

}