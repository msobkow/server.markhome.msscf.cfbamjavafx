// Description: Java 11 JavaFX Display Element Factory Interface for TimeDef.

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
 *	ICFBamJavaFXTimeDefFactory JavaFX Display Element Factory Interface
 *	for TimeDef.
 */
public interface ICFBamJavaFXTimeDefFactory
{
	public CFGridPane newAttrPane( ICFFormManager formManager, ICFBamTimeDefObj javaFXFocus );

	public CFBorderPane newListPane( ICFFormManager formManager,
		ICFBamScopeObj argContainer,
		ICFBamTimeDefObj argFocus,
		Collection<ICFBamTimeDefObj> argDataCollection,
		ICFRefreshCallback refreshCallback,
		boolean sortByChain );

	public CFBorderPane newPickerPane( ICFFormManager formManager,
		ICFBamTimeDefObj argFocus,
		ICFBamScopeObj argContainer,
		Collection<ICFBamTimeDefObj> argDataCollection,
		ICFBamJavaFXTimeDefChosen whenChosen );

	public CFTabPane newEltTabPane( ICFFormManager formManger, ICFBamTimeDefObj javaFXFocus );

	public CFBorderPane newAskDeleteForm( ICFFormManager formManager, ICFBamTimeDefObj javaFXFocus, ICFDeleteCallback callback );

	public CFSplitPane newAddPane( ICFFormManager formManger, ICFBamTimeDefObj javaFXFocus );

	public CFSplitPane newViewEditPane( ICFFormManager formManger, ICFBamTimeDefObj javaFXFocus );

	public CFBorderPane newPickerForm( ICFFormManager formManager,
		ICFBamTimeDefObj javaFXFocus,
		ICFBamScopeObj argContainer,
		Collection<ICFBamTimeDefObj> argDataCollection,
		ICFBamJavaFXTimeDefChosen whenChosen );

	public CFBorderPane newAddForm( ICFFormManager formManager, ICFBamTimeDefObj javaFXFocus, ICFFormClosedCallback closeCallback, boolean allowSave );

	public CFBorderPane newViewEditForm( ICFFormManager formManager, ICFBamTimeDefObj javaFXFocus, ICFFormClosedCallback closeCallback, boolean cameFromAdd );
}
