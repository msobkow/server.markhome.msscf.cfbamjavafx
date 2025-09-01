// Description: Java 11 JavaFX Display Element Factory Interface for UInt32Def.

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
 *	ICFBamJavaFXUInt32DefFactory JavaFX Display Element Factory Interface
 *	for UInt32Def.
 */
public interface ICFBamJavaFXUInt32DefFactory
{
	public CFGridPane newAttrPane( ICFFormManager formManager, ICFBamUInt32DefObj javaFXFocus );

	public CFBorderPane newListPane( ICFFormManager formManager,
		ICFBamScopeObj argContainer,
		ICFBamUInt32DefObj argFocus,
		Collection<ICFBamUInt32DefObj> argDataCollection,
		ICFRefreshCallback refreshCallback,
		boolean sortByChain );

	public CFBorderPane newPickerPane( ICFFormManager formManager,
		ICFBamUInt32DefObj argFocus,
		ICFBamScopeObj argContainer,
		Collection<ICFBamUInt32DefObj> argDataCollection,
		ICFBamJavaFXUInt32DefChosen whenChosen );

	public CFTabPane newEltTabPane( ICFFormManager formManger, ICFBamUInt32DefObj javaFXFocus );

	public CFBorderPane newAskDeleteForm( ICFFormManager formManager, ICFBamUInt32DefObj javaFXFocus, ICFDeleteCallback callback );

	public CFSplitPane newAddPane( ICFFormManager formManger, ICFBamUInt32DefObj javaFXFocus );

	public CFSplitPane newViewEditPane( ICFFormManager formManger, ICFBamUInt32DefObj javaFXFocus );

	public CFBorderPane newPickerForm( ICFFormManager formManager,
		ICFBamUInt32DefObj javaFXFocus,
		ICFBamScopeObj argContainer,
		Collection<ICFBamUInt32DefObj> argDataCollection,
		ICFBamJavaFXUInt32DefChosen whenChosen );

	public CFBorderPane newAddForm( ICFFormManager formManager, ICFBamUInt32DefObj javaFXFocus, ICFFormClosedCallback closeCallback, boolean allowSave );

	public CFBorderPane newViewEditForm( ICFFormManager formManager, ICFBamUInt32DefObj javaFXFocus, ICFFormClosedCallback closeCallback, boolean cameFromAdd );
}
