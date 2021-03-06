/*
 * DBeaver - Universal Database Manager
 * Copyright (C) 2010-2019 Serge Rider (serge@jkiss.org)
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.jkiss.dbeaver.ui.dashboard.control;

import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.swt.custom.CTabFolder;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.jkiss.dbeaver.ui.UIUtils;
import org.jkiss.dbeaver.ui.dashboard.model.DashboardContainer;
import org.jkiss.dbeaver.ui.dialogs.BaseDialog;

class DashboardChartConfigDialog extends BaseDialog {

    private static final String DIALOG_ID = "DBeaver.DashboardChartConfigDialog";//$NON-NLS-1$

    private DashboardChartComposite chartComposite;
    private DashboardContainer container;
    private CTabFolder chartTabFolder;

    DashboardChartConfigDialog(DashboardChartComposite chartComposite, DashboardContainer container)
    {
        super(chartComposite.getShell(), "Charts for [" + container.getDataSourceContainer().getName() + "]", null);

        this.chartComposite = chartComposite;
        this.container = container;
    }

    @Override
    protected IDialogSettings getDialogBoundsSettings()
    {
        return UIUtils.getDialogSettings(DIALOG_ID);
    }

    @Override
    protected Composite createDialogArea(Composite parent)
    {
        Composite composite = super.createDialogArea(parent);

        return parent;
    }

    @Override
    protected Control createContents(Composite parent) {
        Control contents = super.createContents(parent);

        return contents;
    }


    @Override
    protected void okPressed() {
        super.okPressed();
    }
}
