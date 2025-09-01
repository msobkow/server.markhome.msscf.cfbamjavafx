// Description: Java 11 JavaFX Display Element Factory Interface for Atom.

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
 *	ICFBamJavaFXAtomFactory JavaFX Display Element Factory Interface
 *	for Atom.
 */
public interface ICFBamJavaFXAtomFactory
{
	public CFGridPane newAttrPane( ICFFormManager formManager, ICFBamAtomObj javaFXFocus );

	public CFBorderPane newListPane( ICFFormManager formManager,
		ICFBamScopeObj argContainer,
		ICFBamAtomObj argFocus,
		Collection<ICFBamAtomObj> argDataCollection,
		ICFRefreshCallback refreshCallback,
		boolean sortByChain );

	public CFBorderPane newPickerPane( ICFFormManager formManager,
		ICFBamAtomObj argFocus,
		ICFBamScopeObj argContainer,
		Collection<ICFBamAtomObj> argDataCollection,
		ICFBamJavaFXAtomChosen whenChosen );

	public CFTabPane newEltTabPane( ICFFormManager formManger, ICFBamAtomObj javaFXFocus );

	public CFBorderPane newAskDeleteForm( ICFFormManager formManager, ICFBamAtomObj javaFXFocus, ICFDeleteCallback callback );

	public CFSplitPane newAddPane( ICFFormManager formManger, ICFBamAtomObj javaFXFocus );

	public CFSplitPane newViewEditPane( ICFFormManager formManger, ICFBamAtomObj javaFXFocus );

	public CFBorderPane newPickerForm( ICFFormManager formManager,
		ICFBamAtomObj javaFXFocus,
		ICFBamScopeObj argContainer,
		Collection<ICFBamAtomObj> argDataCollection,
		ICFBamJavaFXAtomChosen whenChosen );

	public CFBorderPane newAddForm( ICFFormManager formManager, ICFBamAtomObj javaFXFocus, ICFFormClosedCallback closeCallback, boolean allowSave );

	public CFBorderPane newViewEditForm( ICFFormManager formManager, ICFBamAtomObj javaFXFocus, ICFFormClosedCallback closeCallback, boolean cameFromAdd );
}
