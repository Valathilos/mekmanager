package mekmanager.controls.tools;

import javax.annotation.PostConstruct;

import org.eclipse.swt.SWT;
import org.eclipse.swt.layout.GridLayout;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Text;
import org.eclipse.jface.layout.GridDataFactory;

public class SearchToolItem {
    @PostConstruct
    public void createControls(Composite parent) {
      final Composite comp = new Composite(parent, SWT.RIGHT);
      comp.setLayout(new GridLayout());
      Text text = new Text(comp, SWT.SEARCH | SWT.ICON_SEARCH | SWT.CANCEL
          | SWT.BORDER);
      text.setMessage("Search");
      GridDataFactory.fillDefaults().hint(130, SWT.DEFAULT).applyTo(text);

    }
}
