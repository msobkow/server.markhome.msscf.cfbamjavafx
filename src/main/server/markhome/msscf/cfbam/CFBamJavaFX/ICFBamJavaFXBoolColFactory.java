// Description: Java 11 JavaFX Display Element Factory Interface for BoolCol.

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
 *	ICFBamJavaFXBoolColFactory JavaFX Display Element Factory Interface
 *	for BoolCol.
 */
public interface ICFBamJavaFXBoolColFactory
{
	public CFGridPane newAttrPane( ICFFormManager formManager, ICFBamBoolColObj javaFXFocus );

	public CFBorderPane newListPane( ICFFormManager formManager,
		ICFBamTableObj argContainer,
		ICFBamBoolColObj argFocus,
		Collection<ICFBamBoolColObj> argDataCollection,
		ICFRefreshCallback refreshCallback,
		boolean sortByChain );

	public CFBorderPane newPickerPane( ICFFormManager formManager,
		ICFBamBoolColObj argFocus,
		ICFBamTableObj argContainer,
		Collection<ICFBamBoolColObj> argDataCollection,
		ICFBamJavaFXBoolColChosen whenChosen );

	public CFTabPane newEltTabPane( ICFFormManager formManger, ICFBamBoolColObj javaFXFocus );

	public CFBorderPane newAskDeleteForm( ICFFormManager formManager, ICFBamBoolColObj javaFXFocus, ICFDeleteCallback callback );

	public CFSplitPane newAddPane( ICFFormManager formManger, ICFBamBoolColObj javaFXFocus );

	public CFSplitPane newViewEditPane( ICFFormManager formManger, ICFBamBoolColObj javaFXFocus );

	public CFBorderPane newPickerForm( ICFFormManager formManager,
		ICFBamBoolColObj javaFXFocus,
		ICFBamTableObj argContainer,
		Collection<ICFBamBoolColObj> argDataCollection,
		ICFBamJavaFXBoolColChosen whenChosen );

	public CFBorderPane newAddForm( ICFFormManager formManager, ICFBamBoolColObj javaFXFocus, ICFFormClosedCallback closeCallback, boolean allowSave );

	public CFBorderPane newViewEditForm( ICFFormManager formManager, ICFBamBoolColObj javaFXFocus, ICFFormClosedCallback closeCallback, boolean cameFromAdd );
}
