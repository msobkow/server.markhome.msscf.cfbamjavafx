// Description: Java 11 JavaFX Display Element Factory Interface for BoolDef.

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
 *	ICFBamJavaFXBoolDefFactory JavaFX Display Element Factory Interface
 *	for BoolDef.
 */
public interface ICFBamJavaFXBoolDefFactory
{
	public CFGridPane newAttrPane( ICFFormManager formManager, ICFBamBoolDefObj javaFXFocus );

	public CFBorderPane newListPane( ICFFormManager formManager,
		ICFBamScopeObj argContainer,
		ICFBamBoolDefObj argFocus,
		Collection<ICFBamBoolDefObj> argDataCollection,
		ICFRefreshCallback refreshCallback,
		boolean sortByChain );

	public CFBorderPane newPickerPane( ICFFormManager formManager,
		ICFBamBoolDefObj argFocus,
		ICFBamScopeObj argContainer,
		Collection<ICFBamBoolDefObj> argDataCollection,
		ICFBamJavaFXBoolDefChosen whenChosen );

	public CFTabPane newEltTabPane( ICFFormManager formManger, ICFBamBoolDefObj javaFXFocus );

	public CFBorderPane newAskDeleteForm( ICFFormManager formManager, ICFBamBoolDefObj javaFXFocus, ICFDeleteCallback callback );

	public CFSplitPane newAddPane( ICFFormManager formManger, ICFBamBoolDefObj javaFXFocus );

	public CFSplitPane newViewEditPane( ICFFormManager formManger, ICFBamBoolDefObj javaFXFocus );

	public CFBorderPane newPickerForm( ICFFormManager formManager,
		ICFBamBoolDefObj javaFXFocus,
		ICFBamScopeObj argContainer,
		Collection<ICFBamBoolDefObj> argDataCollection,
		ICFBamJavaFXBoolDefChosen whenChosen );

	public CFBorderPane newAddForm( ICFFormManager formManager, ICFBamBoolDefObj javaFXFocus, ICFFormClosedCallback closeCallback, boolean allowSave );

	public CFBorderPane newViewEditForm( ICFFormManager formManager, ICFBamBoolDefObj javaFXFocus, ICFFormClosedCallback closeCallback, boolean cameFromAdd );
}
