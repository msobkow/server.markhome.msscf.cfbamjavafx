// Description: Java 11 JavaFX Display Element Factory Interface for ServerMethod.

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
 *	ICFBamJavaFXServerMethodFactory JavaFX Display Element Factory Interface
 *	for ServerMethod.
 */
public interface ICFBamJavaFXServerMethodFactory
{
	public CFGridPane newAttrPane( ICFFormManager formManager, ICFBamServerMethodObj javaFXFocus );

	public CFBorderPane newListPane( ICFFormManager formManager,
		ICFBamTableObj argContainer,
		ICFBamServerMethodObj argFocus,
		Collection<ICFBamServerMethodObj> argDataCollection,
		ICFRefreshCallback refreshCallback,
		boolean sortByChain );

	public CFBorderPane newPickerPane( ICFFormManager formManager,
		ICFBamServerMethodObj argFocus,
		ICFBamTableObj argContainer,
		Collection<ICFBamServerMethodObj> argDataCollection,
		ICFBamJavaFXServerMethodChosen whenChosen );

	public CFTabPane newEltTabPane( ICFFormManager formManger, ICFBamServerMethodObj javaFXFocus );

	public CFBorderPane newAskDeleteForm( ICFFormManager formManager, ICFBamServerMethodObj javaFXFocus, ICFDeleteCallback callback );

	public CFSplitPane newAddPane( ICFFormManager formManger, ICFBamServerMethodObj javaFXFocus );

	public CFSplitPane newViewEditPane( ICFFormManager formManger, ICFBamServerMethodObj javaFXFocus );

	public CFBorderPane newPickerForm( ICFFormManager formManager,
		ICFBamServerMethodObj javaFXFocus,
		ICFBamTableObj argContainer,
		Collection<ICFBamServerMethodObj> argDataCollection,
		ICFBamJavaFXServerMethodChosen whenChosen );

	public CFBorderPane newAddForm( ICFFormManager formManager, ICFBamServerMethodObj javaFXFocus, ICFFormClosedCallback closeCallback, boolean allowSave );

	public CFBorderPane newViewEditForm( ICFFormManager formManager, ICFBamServerMethodObj javaFXFocus, ICFFormClosedCallback closeCallback, boolean cameFromAdd );
}
