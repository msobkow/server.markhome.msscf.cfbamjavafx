// Description: Java 11 JavaFX Display Element Factory Interface for TextDef.

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
 *	ICFBamJavaFXTextDefFactory JavaFX Display Element Factory Interface
 *	for TextDef.
 */
public interface ICFBamJavaFXTextDefFactory
{
	public CFGridPane newAttrPane( ICFFormManager formManager, ICFBamTextDefObj javaFXFocus );

	public CFBorderPane newListPane( ICFFormManager formManager,
		ICFBamScopeObj argContainer,
		ICFBamTextDefObj argFocus,
		Collection<ICFBamTextDefObj> argDataCollection,
		ICFRefreshCallback refreshCallback,
		boolean sortByChain );

	public CFBorderPane newPickerPane( ICFFormManager formManager,
		ICFBamTextDefObj argFocus,
		ICFBamScopeObj argContainer,
		Collection<ICFBamTextDefObj> argDataCollection,
		ICFBamJavaFXTextDefChosen whenChosen );

	public CFTabPane newEltTabPane( ICFFormManager formManger, ICFBamTextDefObj javaFXFocus );

	public CFBorderPane newAskDeleteForm( ICFFormManager formManager, ICFBamTextDefObj javaFXFocus, ICFDeleteCallback callback );

	public CFSplitPane newAddPane( ICFFormManager formManger, ICFBamTextDefObj javaFXFocus );

	public CFSplitPane newViewEditPane( ICFFormManager formManger, ICFBamTextDefObj javaFXFocus );

	public CFBorderPane newPickerForm( ICFFormManager formManager,
		ICFBamTextDefObj javaFXFocus,
		ICFBamScopeObj argContainer,
		Collection<ICFBamTextDefObj> argDataCollection,
		ICFBamJavaFXTextDefChosen whenChosen );

	public CFBorderPane newAddForm( ICFFormManager formManager, ICFBamTextDefObj javaFXFocus, ICFFormClosedCallback closeCallback, boolean allowSave );

	public CFBorderPane newViewEditForm( ICFFormManager formManager, ICFBamTextDefObj javaFXFocus, ICFFormClosedCallback closeCallback, boolean cameFromAdd );
}
