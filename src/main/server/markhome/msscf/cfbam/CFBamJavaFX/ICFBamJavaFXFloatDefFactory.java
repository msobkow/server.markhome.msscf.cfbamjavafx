// Description: Java 11 JavaFX Display Element Factory Interface for FloatDef.

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
 *	ICFBamJavaFXFloatDefFactory JavaFX Display Element Factory Interface
 *	for FloatDef.
 */
public interface ICFBamJavaFXFloatDefFactory
{
	public CFGridPane newAttrPane( ICFFormManager formManager, ICFBamFloatDefObj javaFXFocus );

	public CFBorderPane newListPane( ICFFormManager formManager,
		ICFBamScopeObj argContainer,
		ICFBamFloatDefObj argFocus,
		Collection<ICFBamFloatDefObj> argDataCollection,
		ICFRefreshCallback refreshCallback,
		boolean sortByChain );

	public CFBorderPane newPickerPane( ICFFormManager formManager,
		ICFBamFloatDefObj argFocus,
		ICFBamScopeObj argContainer,
		Collection<ICFBamFloatDefObj> argDataCollection,
		ICFBamJavaFXFloatDefChosen whenChosen );

	public CFTabPane newEltTabPane( ICFFormManager formManger, ICFBamFloatDefObj javaFXFocus );

	public CFBorderPane newAskDeleteForm( ICFFormManager formManager, ICFBamFloatDefObj javaFXFocus, ICFDeleteCallback callback );

	public CFSplitPane newAddPane( ICFFormManager formManger, ICFBamFloatDefObj javaFXFocus );

	public CFSplitPane newViewEditPane( ICFFormManager formManger, ICFBamFloatDefObj javaFXFocus );

	public CFBorderPane newPickerForm( ICFFormManager formManager,
		ICFBamFloatDefObj javaFXFocus,
		ICFBamScopeObj argContainer,
		Collection<ICFBamFloatDefObj> argDataCollection,
		ICFBamJavaFXFloatDefChosen whenChosen );

	public CFBorderPane newAddForm( ICFFormManager formManager, ICFBamFloatDefObj javaFXFocus, ICFFormClosedCallback closeCallback, boolean allowSave );

	public CFBorderPane newViewEditForm( ICFFormManager formManager, ICFBamFloatDefObj javaFXFocus, ICFFormClosedCallback closeCallback, boolean cameFromAdd );
}
