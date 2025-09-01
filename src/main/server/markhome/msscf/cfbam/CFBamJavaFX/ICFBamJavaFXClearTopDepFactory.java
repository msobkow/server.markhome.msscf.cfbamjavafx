// Description: Java 11 JavaFX Display Element Factory Interface for ClearTopDep.

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
 *	ICFBamJavaFXClearTopDepFactory JavaFX Display Element Factory Interface
 *	for ClearTopDep.
 */
public interface ICFBamJavaFXClearTopDepFactory
{
	public CFGridPane newAttrPane( ICFFormManager formManager, ICFBamClearTopDepObj javaFXFocus );

	public CFBorderPane newListPane( ICFFormManager formManager,
		ICFBamTableObj argContainer,
		ICFBamClearTopDepObj argFocus,
		Collection<ICFBamClearTopDepObj> argDataCollection,
		ICFRefreshCallback refreshCallback,
		boolean sortByChain );

	public CFBorderPane newPickerPane( ICFFormManager formManager,
		ICFBamClearTopDepObj argFocus,
		ICFBamTableObj argContainer,
		Collection<ICFBamClearTopDepObj> argDataCollection,
		ICFBamJavaFXClearTopDepChosen whenChosen );

	public CFTabPane newEltTabPane( ICFFormManager formManger, ICFBamClearTopDepObj javaFXFocus );

	public CFBorderPane newAskDeleteForm( ICFFormManager formManager, ICFBamClearTopDepObj javaFXFocus, ICFDeleteCallback callback );

	public CFSplitPane newAddPane( ICFFormManager formManger, ICFBamClearTopDepObj javaFXFocus );

	public CFSplitPane newViewEditPane( ICFFormManager formManger, ICFBamClearTopDepObj javaFXFocus );

	public CFBorderPane newPickerForm( ICFFormManager formManager,
		ICFBamClearTopDepObj javaFXFocus,
		ICFBamTableObj argContainer,
		Collection<ICFBamClearTopDepObj> argDataCollection,
		ICFBamJavaFXClearTopDepChosen whenChosen );

	public CFBorderPane newAddForm( ICFFormManager formManager, ICFBamClearTopDepObj javaFXFocus, ICFFormClosedCallback closeCallback, boolean allowSave );

	public CFBorderPane newViewEditForm( ICFFormManager formManager, ICFBamClearTopDepObj javaFXFocus, ICFFormClosedCallback closeCallback, boolean cameFromAdd );
}
