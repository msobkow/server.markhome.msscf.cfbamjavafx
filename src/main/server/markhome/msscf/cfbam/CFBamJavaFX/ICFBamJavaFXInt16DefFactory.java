// Description: Java 11 JavaFX Display Element Factory Interface for Int16Def.

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
 *	ICFBamJavaFXInt16DefFactory JavaFX Display Element Factory Interface
 *	for Int16Def.
 */
public interface ICFBamJavaFXInt16DefFactory
{
	public CFGridPane newAttrPane( ICFFormManager formManager, ICFBamInt16DefObj javaFXFocus );

	public CFBorderPane newListPane( ICFFormManager formManager,
		ICFBamScopeObj argContainer,
		ICFBamInt16DefObj argFocus,
		Collection<ICFBamInt16DefObj> argDataCollection,
		ICFRefreshCallback refreshCallback,
		boolean sortByChain );

	public CFBorderPane newPickerPane( ICFFormManager formManager,
		ICFBamInt16DefObj argFocus,
		ICFBamScopeObj argContainer,
		Collection<ICFBamInt16DefObj> argDataCollection,
		ICFBamJavaFXInt16DefChosen whenChosen );

	public CFTabPane newEltTabPane( ICFFormManager formManger, ICFBamInt16DefObj javaFXFocus );

	public CFBorderPane newAskDeleteForm( ICFFormManager formManager, ICFBamInt16DefObj javaFXFocus, ICFDeleteCallback callback );

	public CFSplitPane newAddPane( ICFFormManager formManger, ICFBamInt16DefObj javaFXFocus );

	public CFSplitPane newViewEditPane( ICFFormManager formManger, ICFBamInt16DefObj javaFXFocus );

	public CFBorderPane newPickerForm( ICFFormManager formManager,
		ICFBamInt16DefObj javaFXFocus,
		ICFBamScopeObj argContainer,
		Collection<ICFBamInt16DefObj> argDataCollection,
		ICFBamJavaFXInt16DefChosen whenChosen );

	public CFBorderPane newAddForm( ICFFormManager formManager, ICFBamInt16DefObj javaFXFocus, ICFFormClosedCallback closeCallback, boolean allowSave );

	public CFBorderPane newViewEditForm( ICFFormManager formManager, ICFBamInt16DefObj javaFXFocus, ICFFormClosedCallback closeCallback, boolean cameFromAdd );
}
