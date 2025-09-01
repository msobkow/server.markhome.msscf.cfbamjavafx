// Description: Java 11 JavaFX Display Element Factory Interface for Scope.

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
 *	ICFBamJavaFXScopeFactory JavaFX Display Element Factory Interface
 *	for Scope.
 */
public interface ICFBamJavaFXScopeFactory
{
	public CFGridPane newAttrPane( ICFFormManager formManager, ICFBamScopeObj javaFXFocus );

	public CFBorderPane newListPane( ICFFormManager formManager,
		ICFLibAnyObj argContainer,
		ICFBamScopeObj argFocus,
		Collection<ICFBamScopeObj> argDataCollection,
		ICFRefreshCallback refreshCallback,
		boolean sortByChain );

	public CFBorderPane newPickerPane( ICFFormManager formManager,
		ICFBamScopeObj argFocus,
		ICFLibAnyObj argContainer,
		Collection<ICFBamScopeObj> argDataCollection,
		ICFBamJavaFXScopeChosen whenChosen );

	public CFTabPane newEltTabPane( ICFFormManager formManger, ICFBamScopeObj javaFXFocus );

	public CFBorderPane newAskDeleteForm( ICFFormManager formManager, ICFBamScopeObj javaFXFocus, ICFDeleteCallback callback );

	public CFSplitPane newAddPane( ICFFormManager formManger, ICFBamScopeObj javaFXFocus );

	public CFSplitPane newViewEditPane( ICFFormManager formManger, ICFBamScopeObj javaFXFocus );

	public CFBorderPane newPickerForm( ICFFormManager formManager,
		ICFBamScopeObj javaFXFocus,
		ICFLibAnyObj argContainer,
		Collection<ICFBamScopeObj> argDataCollection,
		ICFBamJavaFXScopeChosen whenChosen );

	public CFBorderPane newAddForm( ICFFormManager formManager, ICFBamScopeObj javaFXFocus, ICFFormClosedCallback closeCallback, boolean allowSave );

	public CFBorderPane newViewEditForm( ICFFormManager formManager, ICFBamScopeObj javaFXFocus, ICFFormClosedCallback closeCallback, boolean cameFromAdd );
}
