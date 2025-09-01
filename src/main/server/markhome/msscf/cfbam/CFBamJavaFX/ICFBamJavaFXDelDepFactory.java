// Description: Java 11 JavaFX Display Element Factory Interface for DelDep.

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
 *	ICFBamJavaFXDelDepFactory JavaFX Display Element Factory Interface
 *	for DelDep.
 */
public interface ICFBamJavaFXDelDepFactory
{
	public CFGridPane newAttrPane( ICFFormManager formManager, ICFBamDelDepObj javaFXFocus );

	public CFBorderPane newListPane( ICFFormManager formManager,
		ICFLibAnyObj argContainer,
		ICFBamDelDepObj argFocus,
		Collection<ICFBamDelDepObj> argDataCollection,
		ICFRefreshCallback refreshCallback,
		boolean sortByChain );

	public CFBorderPane newPickerPane( ICFFormManager formManager,
		ICFBamDelDepObj argFocus,
		ICFLibAnyObj argContainer,
		Collection<ICFBamDelDepObj> argDataCollection,
		ICFBamJavaFXDelDepChosen whenChosen );

	public CFTabPane newEltTabPane( ICFFormManager formManger, ICFBamDelDepObj javaFXFocus );

	public CFBorderPane newAskDeleteForm( ICFFormManager formManager, ICFBamDelDepObj javaFXFocus, ICFDeleteCallback callback );

	public CFSplitPane newAddPane( ICFFormManager formManger, ICFBamDelDepObj javaFXFocus );

	public CFSplitPane newViewEditPane( ICFFormManager formManger, ICFBamDelDepObj javaFXFocus );

	public CFBorderPane newPickerForm( ICFFormManager formManager,
		ICFBamDelDepObj javaFXFocus,
		ICFLibAnyObj argContainer,
		Collection<ICFBamDelDepObj> argDataCollection,
		ICFBamJavaFXDelDepChosen whenChosen );

	public CFBorderPane newAddForm( ICFFormManager formManager, ICFBamDelDepObj javaFXFocus, ICFFormClosedCallback closeCallback, boolean allowSave );

	public CFBorderPane newViewEditForm( ICFFormManager formManager, ICFBamDelDepObj javaFXFocus, ICFFormClosedCallback closeCallback, boolean cameFromAdd );
}
