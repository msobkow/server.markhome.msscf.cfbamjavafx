// Description: Java 11 JavaFX Display Element Factory Interface for DelSubDep1.

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
 *	ICFBamJavaFXDelSubDep1Factory JavaFX Display Element Factory Interface
 *	for DelSubDep1.
 */
public interface ICFBamJavaFXDelSubDep1Factory
{
	public CFGridPane newAttrPane( ICFFormManager formManager, ICFBamDelSubDep1Obj javaFXFocus );

	public CFBorderPane newListPane( ICFFormManager formManager,
		ICFBamDelTopDepObj argContainer,
		ICFBamDelSubDep1Obj argFocus,
		Collection<ICFBamDelSubDep1Obj> argDataCollection,
		ICFRefreshCallback refreshCallback,
		boolean sortByChain );

	public CFBorderPane newPickerPane( ICFFormManager formManager,
		ICFBamDelSubDep1Obj argFocus,
		ICFBamDelTopDepObj argContainer,
		Collection<ICFBamDelSubDep1Obj> argDataCollection,
		ICFBamJavaFXDelSubDep1Chosen whenChosen );

	public CFTabPane newEltTabPane( ICFFormManager formManger, ICFBamDelSubDep1Obj javaFXFocus );

	public CFBorderPane newAskDeleteForm( ICFFormManager formManager, ICFBamDelSubDep1Obj javaFXFocus, ICFDeleteCallback callback );

	public CFSplitPane newAddPane( ICFFormManager formManger, ICFBamDelSubDep1Obj javaFXFocus );

	public CFSplitPane newViewEditPane( ICFFormManager formManger, ICFBamDelSubDep1Obj javaFXFocus );

	public CFBorderPane newPickerForm( ICFFormManager formManager,
		ICFBamDelSubDep1Obj javaFXFocus,
		ICFBamDelTopDepObj argContainer,
		Collection<ICFBamDelSubDep1Obj> argDataCollection,
		ICFBamJavaFXDelSubDep1Chosen whenChosen );

	public CFBorderPane newAddForm( ICFFormManager formManager, ICFBamDelSubDep1Obj javaFXFocus, ICFFormClosedCallback closeCallback, boolean allowSave );

	public CFBorderPane newViewEditForm( ICFFormManager formManager, ICFBamDelSubDep1Obj javaFXFocus, ICFFormClosedCallback closeCallback, boolean cameFromAdd );
}
