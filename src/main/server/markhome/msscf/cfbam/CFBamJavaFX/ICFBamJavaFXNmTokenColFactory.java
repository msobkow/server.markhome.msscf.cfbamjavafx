// Description: Java 11 JavaFX Display Element Factory Interface for NmTokenCol.

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
 *	ICFBamJavaFXNmTokenColFactory JavaFX Display Element Factory Interface
 *	for NmTokenCol.
 */
public interface ICFBamJavaFXNmTokenColFactory
{
	public CFGridPane newAttrPane( ICFFormManager formManager, ICFBamNmTokenColObj javaFXFocus );

	public CFBorderPane newListPane( ICFFormManager formManager,
		ICFBamTableObj argContainer,
		ICFBamNmTokenColObj argFocus,
		Collection<ICFBamNmTokenColObj> argDataCollection,
		ICFRefreshCallback refreshCallback,
		boolean sortByChain );

	public CFBorderPane newPickerPane( ICFFormManager formManager,
		ICFBamNmTokenColObj argFocus,
		ICFBamTableObj argContainer,
		Collection<ICFBamNmTokenColObj> argDataCollection,
		ICFBamJavaFXNmTokenColChosen whenChosen );

	public CFTabPane newEltTabPane( ICFFormManager formManger, ICFBamNmTokenColObj javaFXFocus );

	public CFBorderPane newAskDeleteForm( ICFFormManager formManager, ICFBamNmTokenColObj javaFXFocus, ICFDeleteCallback callback );

	public CFSplitPane newAddPane( ICFFormManager formManger, ICFBamNmTokenColObj javaFXFocus );

	public CFSplitPane newViewEditPane( ICFFormManager formManger, ICFBamNmTokenColObj javaFXFocus );

	public CFBorderPane newPickerForm( ICFFormManager formManager,
		ICFBamNmTokenColObj javaFXFocus,
		ICFBamTableObj argContainer,
		Collection<ICFBamNmTokenColObj> argDataCollection,
		ICFBamJavaFXNmTokenColChosen whenChosen );

	public CFBorderPane newAddForm( ICFFormManager formManager, ICFBamNmTokenColObj javaFXFocus, ICFFormClosedCallback closeCallback, boolean allowSave );

	public CFBorderPane newViewEditForm( ICFFormManager formManager, ICFBamNmTokenColObj javaFXFocus, ICFFormClosedCallback closeCallback, boolean cameFromAdd );
}
