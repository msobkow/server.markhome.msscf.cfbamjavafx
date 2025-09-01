// Description: Java 11 JavaFX Display Element Factory Interface for Int32Def.

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
 *	ICFBamJavaFXInt32DefFactory JavaFX Display Element Factory Interface
 *	for Int32Def.
 */
public interface ICFBamJavaFXInt32DefFactory
{
	public CFGridPane newAttrPane( ICFFormManager formManager, ICFBamInt32DefObj javaFXFocus );

	public CFBorderPane newListPane( ICFFormManager formManager,
		ICFBamScopeObj argContainer,
		ICFBamInt32DefObj argFocus,
		Collection<ICFBamInt32DefObj> argDataCollection,
		ICFRefreshCallback refreshCallback,
		boolean sortByChain );

	public CFBorderPane newPickerPane( ICFFormManager formManager,
		ICFBamInt32DefObj argFocus,
		ICFBamScopeObj argContainer,
		Collection<ICFBamInt32DefObj> argDataCollection,
		ICFBamJavaFXInt32DefChosen whenChosen );

	public CFTabPane newEltTabPane( ICFFormManager formManger, ICFBamInt32DefObj javaFXFocus );

	public CFBorderPane newAskDeleteForm( ICFFormManager formManager, ICFBamInt32DefObj javaFXFocus, ICFDeleteCallback callback );

	public CFSplitPane newAddPane( ICFFormManager formManger, ICFBamInt32DefObj javaFXFocus );

	public CFSplitPane newViewEditPane( ICFFormManager formManger, ICFBamInt32DefObj javaFXFocus );

	public CFBorderPane newPickerForm( ICFFormManager formManager,
		ICFBamInt32DefObj javaFXFocus,
		ICFBamScopeObj argContainer,
		Collection<ICFBamInt32DefObj> argDataCollection,
		ICFBamJavaFXInt32DefChosen whenChosen );

	public CFBorderPane newAddForm( ICFFormManager formManager, ICFBamInt32DefObj javaFXFocus, ICFFormClosedCallback closeCallback, boolean allowSave );

	public CFBorderPane newViewEditForm( ICFFormManager formManager, ICFBamInt32DefObj javaFXFocus, ICFFormClosedCallback closeCallback, boolean cameFromAdd );
}
