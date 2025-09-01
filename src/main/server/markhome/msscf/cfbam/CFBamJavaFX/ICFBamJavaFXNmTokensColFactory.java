// Description: Java 11 JavaFX Display Element Factory Interface for NmTokensCol.

/*
 *	server.markhome.msscf.CFBam
 *
 *	Copyright (c) 2020-2025 Mark Stephen Sobkow
 *	
 *
 *	Manufactured by MSS Code Factory 2.13
 */

package server.markhome.msscf.cfbam.CFBamJavaFX;

import java.math.*;
import java.sql.*;
import java.text.*;
import java.util.*;
import org.msscf.msscf.cflib.CFLib.*;
import org.msscf.msscf.cflib.CFLib.JavaFX.*;
import org.apache.commons.codec.binary.Base64;
import server.markhome.msscf.cfsec.CFSec.*;
import server.markhome.msscf.cfint.CFInt.*;
import server.markhome.msscf.cfbam.CFBam.*;
import server.markhome.msscf.cfsec.CFSecObj.*;
import server.markhome.msscf.cfint.CFIntObj.*;
import server.markhome.msscf.cfbam.CFBamObj.*;

/**
 *	ICFBamJavaFXNmTokensColFactory JavaFX Display Element Factory Interface
 *	for NmTokensCol.
 */
public interface ICFBamJavaFXNmTokensColFactory
{
	public CFGridPane newAttrPane( ICFFormManager formManager, ICFBamNmTokensColObj javaFXFocus );

	public CFBorderPane newListPane( ICFFormManager formManager,
		ICFBamTableObj argContainer,
		ICFBamNmTokensColObj argFocus,
		Collection<ICFBamNmTokensColObj> argDataCollection,
		ICFRefreshCallback refreshCallback,
		boolean sortByChain );

	public CFBorderPane newPickerPane( ICFFormManager formManager,
		ICFBamNmTokensColObj argFocus,
		ICFBamTableObj argContainer,
		Collection<ICFBamNmTokensColObj> argDataCollection,
		ICFBamJavaFXNmTokensColChosen whenChosen );

	public CFTabPane newEltTabPane( ICFFormManager formManger, ICFBamNmTokensColObj javaFXFocus );

	public CFBorderPane newAskDeleteForm( ICFFormManager formManager, ICFBamNmTokensColObj javaFXFocus, ICFDeleteCallback callback );

	public CFSplitPane newAddPane( ICFFormManager formManger, ICFBamNmTokensColObj javaFXFocus );

	public CFSplitPane newViewEditPane( ICFFormManager formManger, ICFBamNmTokensColObj javaFXFocus );

	public CFBorderPane newPickerForm( ICFFormManager formManager,
		ICFBamNmTokensColObj javaFXFocus,
		ICFBamTableObj argContainer,
		Collection<ICFBamNmTokensColObj> argDataCollection,
		ICFBamJavaFXNmTokensColChosen whenChosen );

	public CFBorderPane newAddForm( ICFFormManager formManager, ICFBamNmTokensColObj javaFXFocus, ICFFormClosedCallback closeCallback, boolean allowSave );

	public CFBorderPane newViewEditForm( ICFFormManager formManager, ICFBamNmTokensColObj javaFXFocus, ICFFormClosedCallback closeCallback, boolean cameFromAdd );
}
