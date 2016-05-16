/*
 * Copyright 2016 Datalogics Inc.
 */

package com.datalogics.pdf.security;

/**
 * This class represents login parameters that are used to login into a LunaSa HSM device.
 */
public class LunaHsmLoginParms extends HsmLoginParms {

    private final String tokenLabel;

    /**
     * Instantiate the login parameters for logging in to a Luna SA device using the first available HSM partition slot
     * and the given password.
     *
     * @param pswd the password to use for the login
     */
    public LunaHsmLoginParms(final String pswd) {
        super(pswd);
        this.tokenLabel = null;
    }

    /**
     * Instantiate the login parameters for logging in to a Luna SA HSM device using the given tokenLabel and password.
     *
     * @param tokenLbl the label of the token to which to login
     * @param pswd the password to use for the login
     */
    public LunaHsmLoginParms(final String tokenLbl, final String pswd) {
        super(pswd);
        this.tokenLabel = tokenLbl;
    }

    /**
     * Get the HSM tokenLabel which is synonymous with partition name.
     *
     * @return tokenLabel
     */
    public String getTokenLabel() {
        return tokenLabel;
    }
}
