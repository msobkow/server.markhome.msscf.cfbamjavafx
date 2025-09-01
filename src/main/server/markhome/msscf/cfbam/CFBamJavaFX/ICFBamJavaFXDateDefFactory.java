// Description: Java 11 JavaFX Display Element Factory Interface for DateDef.

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
 *	ICFBamJavaFXDateDefFactory JavaFX Display Element Factory Interface
 *	for DateDef.
 */
public interface ICFBamJavaFXDateDefFactory
{
	public CFGridPane newAttrPane( ICFFormManager formManager, ICFBamDateDefObj javaFXFocus );

	public CFBorderPane newListPane( ICFFormManager formManager,
		ICFBamScopeObj argContainer,
		ICFBamDateDefObj argFocus,
		Collection<ICFBamDateDefObj> argDataCollection,
		ICFRefreshCallback refreshCallback,
		boolean sortByChain );

	public CFBorderPane newPickerPane( ICFFormManager formManager,
		ICFBamDateDefObj argFocus,
		ICFBamScopeObj argContainer,
		Collection<ICFBamDateDefObj> argDataCollection,
		ICFBamJavaFXDateDefChosen whenChosen );

	public CFTabPane newEltTabPane( ICFFormManager formManger, ICFBamDateDefObj javaFXFocus );

	public CFBorderPane newAskDeleteForm( ICFFormManager formManager, ICFBamDateDefObj javaFXFocus, ICFDeleteCallback callback );

	public CFSplitPane newAddPane( ICFFormManager formManger, ICFBamDateDefObj javaFXFocus );

	public CFSplitPane newViewEditPane( ICFFormManager formManger, ICFBamDateDefObj javaFXFocus );

	public CFBorderPane newPickerForm( ICFFormManager formManager,
		ICFBamDateDefObj javaFXFocus,
		ICFBamScopeObj argContainer,
		Collection<ICFBamDateDefObj> argDataCollection,
		ICFBamJavaFXDateDefChosen whenChosen );

	public CFBorderPane newAddForm( ICFFormManager formManager, ICFBamDateDefObj javaFXFocus, ICFFormClosedCallback closeCallback, boolean allowSave );

	public CFBorderPane newViewEditForm( ICFFormManager formManager, ICFBamDateDefObj javaFXFocus, ICFFormClosedCallback closeCallback, boolean cameFromAdd );
}
