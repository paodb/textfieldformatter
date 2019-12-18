package org.vaadin.textfieldformatter.phone;

import org.vaadin.textfieldformatter.AbstractPhoneFieldFormatter;

import com.vaadin.flow.component.dependency.JsModule;

@JsModule("cleave.js/dist/addons/cleave-phone.pm.js")
public class PhonePMFieldFormatter extends AbstractPhoneFieldFormatter {

    public PhonePMFieldFormatter() {
        super(AbstractPhoneFieldFormatter.REGION_PM);
    }

}