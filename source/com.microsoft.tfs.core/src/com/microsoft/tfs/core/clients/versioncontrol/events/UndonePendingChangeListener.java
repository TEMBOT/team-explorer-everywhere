// Copyright (c) Microsoft. All rights reserved.
// Licensed under the MIT license. See License.txt in the repository root.

package com.microsoft.tfs.core.clients.versioncontrol.events;

import java.util.EventListener;

/**
 * Defines an interface for listeners of the {@link PendingChangeEvent}.
 *
 * @since TEE-SDK-10.1
 */
public interface UndonePendingChangeListener extends EventListener {
    public void onUndonePendingChange(PendingChangeEvent e);
}
