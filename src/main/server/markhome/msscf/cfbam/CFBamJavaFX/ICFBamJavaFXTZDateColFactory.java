// Description: Java 11 JavaFX Display Element Factory Interface for TZDateCol.

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
 *	ICFBamJavaFXTZDateColFactory JavaFX Display Element Factory Interface
 *	for TZDateCol.
 */
public interface ICFBamJavaFXTZDateColFactory
{
	public CFGridPane newAttrPane( ICFFormManager formManager, ICFBamTZDateColObj javaFXFocus );

	public CFBorderPane newListPane( ICFFormManager formManager,
		ICFBamTableObj argContainer,
		ICFBamTZDateColObj argFocus,
		Collection<ICFBamTZDateColObj> argDataCollection,
		ICFRefreshCallback refreshCallback,
		boolean sortByChain );

	public CFBorderPane newPickerPane( ICFFormManager formManager,
		ICFBamTZDateColObj argFocus,
		ICFBamTableObj argContainer,
		Collection<ICFBamTZDateColObj> argDataCollection,
		ICFBamJavaFXTZDateColChosen whenChosen );

	public CFTabPane newEltTabPane( ICFFormManager formManger, ICFBamTZDateColObj javaFXFocus );

	public CFBorderPane newAskDeleteForm( ICFFormManager formManager, ICFBamTZDateColObj javaFXFocus, ICFDeleteCallback callback );

	public CFSplitPane newAddPane( ICFFormManager formManger, ICFBamTZDateColObj javaFXFocus );

	public CFSplitPane newViewEditPane( ICFFormManager formManger, ICFBamTZDateColObj javaFXFocus );

	public CFBorderPane newPickerForm( ICFFormManager formManager,
		ICFBamTZDateColObj javaFXFocus,
		ICFBamTableObj argContainer,
		Collection<ICFBamTZDateColObj> argDataCollection,
		ICFBamJavaFXTZDateColChosen whenChosen );

	public CFBorderPane newAddForm( ICFFormManager formManager, ICFBamTZDateColObj javaFXFocus, ICFFormClosedCallback closeCallback, boolean allowSave );

	public CFBorderPane newViewEditForm( ICFFormManager formManager, ICFBamTZDateColObj javaFXFocus, ICFFormClosedCallback closeCallback, boolean cameFromAdd );
}
