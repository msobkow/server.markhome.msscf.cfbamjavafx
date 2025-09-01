// Description: Java 11 JavaFX Display Element Factory Interface for StringDef.

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
 *	ICFBamJavaFXStringDefFactory JavaFX Display Element Factory Interface
 *	for StringDef.
 */
public interface ICFBamJavaFXStringDefFactory
{
	public CFGridPane newAttrPane( ICFFormManager formManager, ICFBamStringDefObj javaFXFocus );

	public CFBorderPane newListPane( ICFFormManager formManager,
		ICFBamScopeObj argContainer,
		ICFBamStringDefObj argFocus,
		Collection<ICFBamStringDefObj> argDataCollection,
		ICFRefreshCallback refreshCallback,
		boolean sortByChain );

	public CFBorderPane newPickerPane( ICFFormManager formManager,
		ICFBamStringDefObj argFocus,
		ICFBamScopeObj argContainer,
		Collection<ICFBamStringDefObj> argDataCollection,
		ICFBamJavaFXStringDefChosen whenChosen );

	public CFTabPane newEltTabPane( ICFFormManager formManger, ICFBamStringDefObj javaFXFocus );

	public CFBorderPane newAskDeleteForm( ICFFormManager formManager, ICFBamStringDefObj javaFXFocus, ICFDeleteCallback callback );

	public CFSplitPane newAddPane( ICFFormManager formManger, ICFBamStringDefObj javaFXFocus );

	public CFSplitPane newViewEditPane( ICFFormManager formManger, ICFBamStringDefObj javaFXFocus );

	public CFBorderPane newPickerForm( ICFFormManager formManager,
		ICFBamStringDefObj javaFXFocus,
		ICFBamScopeObj argContainer,
		Collection<ICFBamStringDefObj> argDataCollection,
		ICFBamJavaFXStringDefChosen whenChosen );

	public CFBorderPane newAddForm( ICFFormManager formManager, ICFBamStringDefObj javaFXFocus, ICFFormClosedCallback closeCallback, boolean allowSave );

	public CFBorderPane newViewEditForm( ICFFormManager formManager, ICFBamStringDefObj javaFXFocus, ICFFormClosedCallback closeCallback, boolean cameFromAdd );
}
