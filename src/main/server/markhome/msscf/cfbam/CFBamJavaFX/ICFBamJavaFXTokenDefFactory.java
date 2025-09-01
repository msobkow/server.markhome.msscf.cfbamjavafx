// Description: Java 11 JavaFX Display Element Factory Interface for TokenDef.

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
 *	ICFBamJavaFXTokenDefFactory JavaFX Display Element Factory Interface
 *	for TokenDef.
 */
public interface ICFBamJavaFXTokenDefFactory
{
	public CFGridPane newAttrPane( ICFFormManager formManager, ICFBamTokenDefObj javaFXFocus );

	public CFBorderPane newListPane( ICFFormManager formManager,
		ICFBamScopeObj argContainer,
		ICFBamTokenDefObj argFocus,
		Collection<ICFBamTokenDefObj> argDataCollection,
		ICFRefreshCallback refreshCallback,
		boolean sortByChain );

	public CFBorderPane newPickerPane( ICFFormManager formManager,
		ICFBamTokenDefObj argFocus,
		ICFBamScopeObj argContainer,
		Collection<ICFBamTokenDefObj> argDataCollection,
		ICFBamJavaFXTokenDefChosen whenChosen );

	public CFTabPane newEltTabPane( ICFFormManager formManger, ICFBamTokenDefObj javaFXFocus );

	public CFBorderPane newAskDeleteForm( ICFFormManager formManager, ICFBamTokenDefObj javaFXFocus, ICFDeleteCallback callback );

	public CFSplitPane newAddPane( ICFFormManager formManger, ICFBamTokenDefObj javaFXFocus );

	public CFSplitPane newViewEditPane( ICFFormManager formManger, ICFBamTokenDefObj javaFXFocus );

	public CFBorderPane newPickerForm( ICFFormManager formManager,
		ICFBamTokenDefObj javaFXFocus,
		ICFBamScopeObj argContainer,
		Collection<ICFBamTokenDefObj> argDataCollection,
		ICFBamJavaFXTokenDefChosen whenChosen );

	public CFBorderPane newAddForm( ICFFormManager formManager, ICFBamTokenDefObj javaFXFocus, ICFFormClosedCallback closeCallback, boolean allowSave );

	public CFBorderPane newViewEditForm( ICFFormManager formManager, ICFBamTokenDefObj javaFXFocus, ICFFormClosedCallback closeCallback, boolean cameFromAdd );
}
