// Description: Java 11 JavaFX Display Element Factory for ClearSubDep1.

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
 *	CFBamJavaFXClearSubDep1Factory JavaFX Display Element Factory
 *	for ClearSubDep1.
 */
public class CFBamJavaFXClearSubDep1Factory
implements ICFBamJavaFXClearSubDep1Factory
{
	protected ICFBamJavaFXSchema javafxSchema = null;

	public CFBamJavaFXClearSubDep1Factory( ICFBamJavaFXSchema argSchema ) {
		final String S_ProcName = "construct-schema";
		if( argSchema == null ) {
			throw new CFLibNullArgumentException( this.getClass(),
				S_ProcName,
				1,
				"argSchema" );
		}
		javafxSchema = argSchema;
	}

	public CFGridPane newAttrPane( ICFFormManager formManager, ICFBamClearSubDep1Obj argFocus ) {
		CFBamJavaFXClearSubDep1AttrPane retnew = new CFBamJavaFXClearSubDep1AttrPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFBorderPane newListPane( ICFFormManager formManager,
		ICFBamClearTopDepObj argContainer,
		ICFBamClearSubDep1Obj argFocus,
		Collection<ICFBamClearSubDep1Obj> argDataCollection,
		ICFRefreshCallback refreshCallback,
		boolean sortByChain )
	{
		CFBamJavaFXClearSubDep1ListPane retnew = new CFBamJavaFXClearSubDep1ListPane( formManager,
			javafxSchema,
			argContainer,
			argFocus,
			argDataCollection,
			refreshCallback,
			sortByChain );
		return( retnew );
	}

	public CFBorderPane newPickerPane( ICFFormManager formManager,
		ICFBamClearSubDep1Obj argFocus,
		ICFBamClearTopDepObj argContainer,
		Collection<ICFBamClearSubDep1Obj> argDataCollection,
		ICFBamJavaFXClearSubDep1Chosen whenChosen )
	{
		CFBamJavaFXClearSubDep1PickerPane retnew = new CFBamJavaFXClearSubDep1PickerPane( formManager,
			javafxSchema,
			argFocus,
			argContainer,
			argDataCollection,
			whenChosen );
		return( retnew );
	}

	public CFTabPane newEltTabPane( ICFFormManager formManager, ICFBamClearSubDep1Obj argFocus ) {
		CFBamJavaFXClearSubDep1EltTabPane retnew = new CFBamJavaFXClearSubDep1EltTabPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFSplitPane newAddPane( ICFFormManager formManager, ICFBamClearSubDep1Obj argFocus ) {
		CFBamJavaFXClearSubDep1AddPane retnew = new CFBamJavaFXClearSubDep1AddPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFSplitPane newViewEditPane( ICFFormManager formManager, ICFBamClearSubDep1Obj argFocus ) {
		CFBamJavaFXClearSubDep1ViewEditPane retnew = new CFBamJavaFXClearSubDep1ViewEditPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFBorderPane newAskDeleteForm( ICFFormManager formManager, ICFBamClearSubDep1Obj argFocus, ICFDeleteCallback callback ) {
		CFBamJavaFXClearSubDep1AskDeleteForm retnew = new CFBamJavaFXClearSubDep1AskDeleteForm( formManager, javafxSchema, argFocus, callback );
		return( retnew );
	}

	public CFBorderPane newPickerForm( ICFFormManager formManager,
		ICFBamClearSubDep1Obj argFocus,
		ICFBamClearTopDepObj argContainer,
		Collection<ICFBamClearSubDep1Obj> argDataCollection,
		ICFBamJavaFXClearSubDep1Chosen whenChosen )
	{
		CFBamJavaFXClearSubDep1PickerForm retnew = new CFBamJavaFXClearSubDep1PickerForm( formManager,
			javafxSchema,
			argFocus,
			argContainer,
			argDataCollection,
			whenChosen );
		return( retnew );
	}

	public CFBorderPane newAddForm( ICFFormManager formManager, ICFBamClearSubDep1Obj argFocus, ICFFormClosedCallback closeCallback, boolean allowSave ) {
		CFBamJavaFXClearSubDep1AddForm retnew = new CFBamJavaFXClearSubDep1AddForm( formManager, javafxSchema, argFocus, closeCallback, allowSave );
		return( retnew );
	}

	public CFBorderPane newViewEditForm( ICFFormManager formManager, ICFBamClearSubDep1Obj argFocus, ICFFormClosedCallback closeCallback, boolean cameFromAdd ) {
		CFBamJavaFXClearSubDep1ViewEditForm retnew = new CFBamJavaFXClearSubDep1ViewEditForm( formManager, javafxSchema, argFocus, closeCallback, cameFromAdd );
		return( retnew );
	}
}
