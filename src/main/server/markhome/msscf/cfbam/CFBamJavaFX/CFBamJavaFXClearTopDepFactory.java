// Description: Java 11 JavaFX Display Element Factory for ClearTopDep.

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
 *	CFBamJavaFXClearTopDepFactory JavaFX Display Element Factory
 *	for ClearTopDep.
 */
public class CFBamJavaFXClearTopDepFactory
implements ICFBamJavaFXClearTopDepFactory
{
	protected ICFBamJavaFXSchema javafxSchema = null;

	public CFBamJavaFXClearTopDepFactory( ICFBamJavaFXSchema argSchema ) {
		final String S_ProcName = "construct-schema";
		if( argSchema == null ) {
			throw new CFLibNullArgumentException( this.getClass(),
				S_ProcName,
				1,
				"argSchema" );
		}
		javafxSchema = argSchema;
	}

	public CFGridPane newAttrPane( ICFFormManager formManager, ICFBamClearTopDepObj argFocus ) {
		CFBamJavaFXClearTopDepAttrPane retnew = new CFBamJavaFXClearTopDepAttrPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFBorderPane newListPane( ICFFormManager formManager,
		ICFBamTableObj argContainer,
		ICFBamClearTopDepObj argFocus,
		Collection<ICFBamClearTopDepObj> argDataCollection,
		ICFRefreshCallback refreshCallback,
		boolean sortByChain )
	{
		CFBamJavaFXClearTopDepListPane retnew = new CFBamJavaFXClearTopDepListPane( formManager,
			javafxSchema,
			argContainer,
			argFocus,
			argDataCollection,
			refreshCallback,
			sortByChain );
		return( retnew );
	}

	public CFBorderPane newPickerPane( ICFFormManager formManager,
		ICFBamClearTopDepObj argFocus,
		ICFBamTableObj argContainer,
		Collection<ICFBamClearTopDepObj> argDataCollection,
		ICFBamJavaFXClearTopDepChosen whenChosen )
	{
		CFBamJavaFXClearTopDepPickerPane retnew = new CFBamJavaFXClearTopDepPickerPane( formManager,
			javafxSchema,
			argFocus,
			argContainer,
			argDataCollection,
			whenChosen );
		return( retnew );
	}

	public CFTabPane newEltTabPane( ICFFormManager formManager, ICFBamClearTopDepObj argFocus ) {
		CFBamJavaFXClearTopDepEltTabPane retnew = new CFBamJavaFXClearTopDepEltTabPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFSplitPane newAddPane( ICFFormManager formManager, ICFBamClearTopDepObj argFocus ) {
		CFBamJavaFXClearTopDepAddPane retnew = new CFBamJavaFXClearTopDepAddPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFSplitPane newViewEditPane( ICFFormManager formManager, ICFBamClearTopDepObj argFocus ) {
		CFBamJavaFXClearTopDepViewEditPane retnew = new CFBamJavaFXClearTopDepViewEditPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFBorderPane newAskDeleteForm( ICFFormManager formManager, ICFBamClearTopDepObj argFocus, ICFDeleteCallback callback ) {
		CFBamJavaFXClearTopDepAskDeleteForm retnew = new CFBamJavaFXClearTopDepAskDeleteForm( formManager, javafxSchema, argFocus, callback );
		return( retnew );
	}

	public CFBorderPane newPickerForm( ICFFormManager formManager,
		ICFBamClearTopDepObj argFocus,
		ICFBamTableObj argContainer,
		Collection<ICFBamClearTopDepObj> argDataCollection,
		ICFBamJavaFXClearTopDepChosen whenChosen )
	{
		CFBamJavaFXClearTopDepPickerForm retnew = new CFBamJavaFXClearTopDepPickerForm( formManager,
			javafxSchema,
			argFocus,
			argContainer,
			argDataCollection,
			whenChosen );
		return( retnew );
	}

	public CFBorderPane newAddForm( ICFFormManager formManager, ICFBamClearTopDepObj argFocus, ICFFormClosedCallback closeCallback, boolean allowSave ) {
		CFBamJavaFXClearTopDepAddForm retnew = new CFBamJavaFXClearTopDepAddForm( formManager, javafxSchema, argFocus, closeCallback, allowSave );
		return( retnew );
	}

	public CFBorderPane newViewEditForm( ICFFormManager formManager, ICFBamClearTopDepObj argFocus, ICFFormClosedCallback closeCallback, boolean cameFromAdd ) {
		CFBamJavaFXClearTopDepViewEditForm retnew = new CFBamJavaFXClearTopDepViewEditForm( formManager, javafxSchema, argFocus, closeCallback, cameFromAdd );
		return( retnew );
	}
}
