// Description: Java 11 JavaFX Display Element Factory Interface for ServerObjFunc.

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
 *	ICFBamJavaFXServerObjFuncFactory JavaFX Display Element Factory Interface
 *	for ServerObjFunc.
 */
public interface ICFBamJavaFXServerObjFuncFactory
{
	public CFGridPane newAttrPane( ICFFormManager formManager, ICFBamServerObjFuncObj javaFXFocus );

	public CFBorderPane newListPane( ICFFormManager formManager,
		ICFBamTableObj argContainer,
		ICFBamServerObjFuncObj argFocus,
		Collection<ICFBamServerObjFuncObj> argDataCollection,
		ICFRefreshCallback refreshCallback,
		boolean sortByChain );

	public CFBorderPane newPickerPane( ICFFormManager formManager,
		ICFBamServerObjFuncObj argFocus,
		ICFBamTableObj argContainer,
		Collection<ICFBamServerObjFuncObj> argDataCollection,
		ICFBamJavaFXServerObjFuncChosen whenChosen );

	public CFTabPane newEltTabPane( ICFFormManager formManger, ICFBamServerObjFuncObj javaFXFocus );

	public CFBorderPane newAskDeleteForm( ICFFormManager formManager, ICFBamServerObjFuncObj javaFXFocus, ICFDeleteCallback callback );

	public CFSplitPane newAddPane( ICFFormManager formManger, ICFBamServerObjFuncObj javaFXFocus );

	public CFSplitPane newViewEditPane( ICFFormManager formManger, ICFBamServerObjFuncObj javaFXFocus );

	public CFBorderPane newPickerForm( ICFFormManager formManager,
		ICFBamServerObjFuncObj javaFXFocus,
		ICFBamTableObj argContainer,
		Collection<ICFBamServerObjFuncObj> argDataCollection,
		ICFBamJavaFXServerObjFuncChosen whenChosen );

	public CFBorderPane newAddForm( ICFFormManager formManager, ICFBamServerObjFuncObj javaFXFocus, ICFFormClosedCallback closeCallback, boolean allowSave );

	public CFBorderPane newViewEditForm( ICFFormManager formManager, ICFBamServerObjFuncObj javaFXFocus, ICFFormClosedCallback closeCallback, boolean cameFromAdd );
}
