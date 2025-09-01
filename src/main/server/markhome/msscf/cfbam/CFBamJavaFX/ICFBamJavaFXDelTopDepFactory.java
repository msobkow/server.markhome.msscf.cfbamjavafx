// Description: Java 11 JavaFX Display Element Factory Interface for DelTopDep.

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
 *	ICFBamJavaFXDelTopDepFactory JavaFX Display Element Factory Interface
 *	for DelTopDep.
 */
public interface ICFBamJavaFXDelTopDepFactory
{
	public CFGridPane newAttrPane( ICFFormManager formManager, ICFBamDelTopDepObj javaFXFocus );

	public CFBorderPane newListPane( ICFFormManager formManager,
		ICFBamTableObj argContainer,
		ICFBamDelTopDepObj argFocus,
		Collection<ICFBamDelTopDepObj> argDataCollection,
		ICFRefreshCallback refreshCallback,
		boolean sortByChain );

	public CFBorderPane newPickerPane( ICFFormManager formManager,
		ICFBamDelTopDepObj argFocus,
		ICFBamTableObj argContainer,
		Collection<ICFBamDelTopDepObj> argDataCollection,
		ICFBamJavaFXDelTopDepChosen whenChosen );

	public CFTabPane newEltTabPane( ICFFormManager formManger, ICFBamDelTopDepObj javaFXFocus );

	public CFBorderPane newAskDeleteForm( ICFFormManager formManager, ICFBamDelTopDepObj javaFXFocus, ICFDeleteCallback callback );

	public CFSplitPane newAddPane( ICFFormManager formManger, ICFBamDelTopDepObj javaFXFocus );

	public CFSplitPane newViewEditPane( ICFFormManager formManger, ICFBamDelTopDepObj javaFXFocus );

	public CFBorderPane newPickerForm( ICFFormManager formManager,
		ICFBamDelTopDepObj javaFXFocus,
		ICFBamTableObj argContainer,
		Collection<ICFBamDelTopDepObj> argDataCollection,
		ICFBamJavaFXDelTopDepChosen whenChosen );

	public CFBorderPane newAddForm( ICFFormManager formManager, ICFBamDelTopDepObj javaFXFocus, ICFFormClosedCallback closeCallback, boolean allowSave );

	public CFBorderPane newViewEditForm( ICFFormManager formManager, ICFBamDelTopDepObj javaFXFocus, ICFFormClosedCallback closeCallback, boolean cameFromAdd );
}
