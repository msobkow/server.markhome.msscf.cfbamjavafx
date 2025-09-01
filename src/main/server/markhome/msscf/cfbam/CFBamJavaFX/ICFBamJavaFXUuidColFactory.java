// Description: Java 11 JavaFX Display Element Factory Interface for UuidCol.

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
 *	ICFBamJavaFXUuidColFactory JavaFX Display Element Factory Interface
 *	for UuidCol.
 */
public interface ICFBamJavaFXUuidColFactory
{
	public CFGridPane newAttrPane( ICFFormManager formManager, ICFBamUuidColObj javaFXFocus );

	public CFBorderPane newListPane( ICFFormManager formManager,
		ICFBamTableObj argContainer,
		ICFBamUuidColObj argFocus,
		Collection<ICFBamUuidColObj> argDataCollection,
		ICFRefreshCallback refreshCallback,
		boolean sortByChain );

	public CFBorderPane newPickerPane( ICFFormManager formManager,
		ICFBamUuidColObj argFocus,
		ICFBamTableObj argContainer,
		Collection<ICFBamUuidColObj> argDataCollection,
		ICFBamJavaFXUuidColChosen whenChosen );

	public CFTabPane newEltTabPane( ICFFormManager formManger, ICFBamUuidColObj javaFXFocus );

	public CFBorderPane newAskDeleteForm( ICFFormManager formManager, ICFBamUuidColObj javaFXFocus, ICFDeleteCallback callback );

	public CFSplitPane newAddPane( ICFFormManager formManger, ICFBamUuidColObj javaFXFocus );

	public CFSplitPane newViewEditPane( ICFFormManager formManger, ICFBamUuidColObj javaFXFocus );

	public CFBorderPane newPickerForm( ICFFormManager formManager,
		ICFBamUuidColObj javaFXFocus,
		ICFBamTableObj argContainer,
		Collection<ICFBamUuidColObj> argDataCollection,
		ICFBamJavaFXUuidColChosen whenChosen );

	public CFBorderPane newAddForm( ICFFormManager formManager, ICFBamUuidColObj javaFXFocus, ICFFormClosedCallback closeCallback, boolean allowSave );

	public CFBorderPane newViewEditForm( ICFFormManager formManager, ICFBamUuidColObj javaFXFocus, ICFFormClosedCallback closeCallback, boolean cameFromAdd );
}
