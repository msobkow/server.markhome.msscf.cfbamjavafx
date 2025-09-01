// Description: Java 11 JavaFX Display Element Factory Interface for PopDep.

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
 *	ICFBamJavaFXPopDepFactory JavaFX Display Element Factory Interface
 *	for PopDep.
 */
public interface ICFBamJavaFXPopDepFactory
{
	public CFGridPane newAttrPane( ICFFormManager formManager, ICFBamPopDepObj javaFXFocus );

	public CFBorderPane newListPane( ICFFormManager formManager,
		ICFLibAnyObj argContainer,
		ICFBamPopDepObj argFocus,
		Collection<ICFBamPopDepObj> argDataCollection,
		ICFRefreshCallback refreshCallback,
		boolean sortByChain );

	public CFBorderPane newPickerPane( ICFFormManager formManager,
		ICFBamPopDepObj argFocus,
		ICFLibAnyObj argContainer,
		Collection<ICFBamPopDepObj> argDataCollection,
		ICFBamJavaFXPopDepChosen whenChosen );

	public CFTabPane newEltTabPane( ICFFormManager formManger, ICFBamPopDepObj javaFXFocus );

	public CFBorderPane newAskDeleteForm( ICFFormManager formManager, ICFBamPopDepObj javaFXFocus, ICFDeleteCallback callback );

	public CFSplitPane newAddPane( ICFFormManager formManger, ICFBamPopDepObj javaFXFocus );

	public CFSplitPane newViewEditPane( ICFFormManager formManger, ICFBamPopDepObj javaFXFocus );

	public CFBorderPane newPickerForm( ICFFormManager formManager,
		ICFBamPopDepObj javaFXFocus,
		ICFLibAnyObj argContainer,
		Collection<ICFBamPopDepObj> argDataCollection,
		ICFBamJavaFXPopDepChosen whenChosen );

	public CFBorderPane newAddForm( ICFFormManager formManager, ICFBamPopDepObj javaFXFocus, ICFFormClosedCallback closeCallback, boolean allowSave );

	public CFBorderPane newViewEditForm( ICFFormManager formManager, ICFBamPopDepObj javaFXFocus, ICFFormClosedCallback closeCallback, boolean cameFromAdd );
}
