// Description: Java 11 JavaFX Display Element Factory Interface for DoubleDef.

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
 *	ICFBamJavaFXDoubleDefFactory JavaFX Display Element Factory Interface
 *	for DoubleDef.
 */
public interface ICFBamJavaFXDoubleDefFactory
{
	public CFGridPane newAttrPane( ICFFormManager formManager, ICFBamDoubleDefObj javaFXFocus );

	public CFBorderPane newListPane( ICFFormManager formManager,
		ICFBamScopeObj argContainer,
		ICFBamDoubleDefObj argFocus,
		Collection<ICFBamDoubleDefObj> argDataCollection,
		ICFRefreshCallback refreshCallback,
		boolean sortByChain );

	public CFBorderPane newPickerPane( ICFFormManager formManager,
		ICFBamDoubleDefObj argFocus,
		ICFBamScopeObj argContainer,
		Collection<ICFBamDoubleDefObj> argDataCollection,
		ICFBamJavaFXDoubleDefChosen whenChosen );

	public CFTabPane newEltTabPane( ICFFormManager formManger, ICFBamDoubleDefObj javaFXFocus );

	public CFBorderPane newAskDeleteForm( ICFFormManager formManager, ICFBamDoubleDefObj javaFXFocus, ICFDeleteCallback callback );

	public CFSplitPane newAddPane( ICFFormManager formManger, ICFBamDoubleDefObj javaFXFocus );

	public CFSplitPane newViewEditPane( ICFFormManager formManger, ICFBamDoubleDefObj javaFXFocus );

	public CFBorderPane newPickerForm( ICFFormManager formManager,
		ICFBamDoubleDefObj javaFXFocus,
		ICFBamScopeObj argContainer,
		Collection<ICFBamDoubleDefObj> argDataCollection,
		ICFBamJavaFXDoubleDefChosen whenChosen );

	public CFBorderPane newAddForm( ICFFormManager formManager, ICFBamDoubleDefObj javaFXFocus, ICFFormClosedCallback closeCallback, boolean allowSave );

	public CFBorderPane newViewEditForm( ICFFormManager formManager, ICFBamDoubleDefObj javaFXFocus, ICFFormClosedCallback closeCallback, boolean cameFromAdd );
}
