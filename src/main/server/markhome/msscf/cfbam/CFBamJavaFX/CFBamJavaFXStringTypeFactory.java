// Description: Java 11 JavaFX Display Element Factory for StringType.

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
 *	CFBamJavaFXStringTypeFactory JavaFX Display Element Factory
 *	for StringType.
 */
public class CFBamJavaFXStringTypeFactory
implements ICFBamJavaFXStringTypeFactory
{
	protected ICFBamJavaFXSchema javafxSchema = null;

	public CFBamJavaFXStringTypeFactory( ICFBamJavaFXSchema argSchema ) {
		final String S_ProcName = "construct-schema";
		if( argSchema == null ) {
			throw new CFLibNullArgumentException( this.getClass(),
				S_ProcName,
				1,
				"argSchema" );
		}
		javafxSchema = argSchema;
	}

	public CFGridPane newAttrPane( ICFFormManager formManager, ICFBamStringTypeObj argFocus ) {
		CFBamJavaFXStringTypeAttrPane retnew = new CFBamJavaFXStringTypeAttrPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFBorderPane newListPane( ICFFormManager formManager,
		ICFBamSchemaDefObj argContainer,
		ICFBamStringTypeObj argFocus,
		Collection<ICFBamStringTypeObj> argDataCollection,
		ICFRefreshCallback refreshCallback,
		boolean sortByChain )
	{
		CFBamJavaFXStringTypeListPane retnew = new CFBamJavaFXStringTypeListPane( formManager,
			javafxSchema,
			argContainer,
			argFocus,
			argDataCollection,
			refreshCallback,
			sortByChain );
		return( retnew );
	}

	public CFBorderPane newPickerPane( ICFFormManager formManager,
		ICFBamStringTypeObj argFocus,
		ICFBamSchemaDefObj argContainer,
		Collection<ICFBamStringTypeObj> argDataCollection,
		ICFBamJavaFXStringTypeChosen whenChosen )
	{
		CFBamJavaFXStringTypePickerPane retnew = new CFBamJavaFXStringTypePickerPane( formManager,
			javafxSchema,
			argFocus,
			argContainer,
			argDataCollection,
			whenChosen );
		return( retnew );
	}

	public CFTabPane newEltTabPane( ICFFormManager formManager, ICFBamStringTypeObj argFocus ) {
		CFBamJavaFXStringTypeEltTabPane retnew = new CFBamJavaFXStringTypeEltTabPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFSplitPane newAddPane( ICFFormManager formManager, ICFBamStringTypeObj argFocus ) {
		CFBamJavaFXStringTypeAddPane retnew = new CFBamJavaFXStringTypeAddPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFSplitPane newViewEditPane( ICFFormManager formManager, ICFBamStringTypeObj argFocus ) {
		CFBamJavaFXStringTypeViewEditPane retnew = new CFBamJavaFXStringTypeViewEditPane( formManager, javafxSchema, argFocus );
		return( retnew );
	}

	public CFBorderPane newAskDeleteForm( ICFFormManager formManager, ICFBamStringTypeObj argFocus, ICFDeleteCallback callback ) {
		CFBamJavaFXStringTypeAskDeleteForm retnew = new CFBamJavaFXStringTypeAskDeleteForm( formManager, javafxSchema, argFocus, callback );
		return( retnew );
	}

	public CFBorderPane newPickerForm( ICFFormManager formManager,
		ICFBamStringTypeObj argFocus,
		ICFBamSchemaDefObj argContainer,
		Collection<ICFBamStringTypeObj> argDataCollection,
		ICFBamJavaFXStringTypeChosen whenChosen )
	{
		CFBamJavaFXStringTypePickerForm retnew = new CFBamJavaFXStringTypePickerForm( formManager,
			javafxSchema,
			argFocus,
			argContainer,
			argDataCollection,
			whenChosen );
		return( retnew );
	}

	public CFBorderPane newAddForm( ICFFormManager formManager, ICFBamStringTypeObj argFocus, ICFFormClosedCallback closeCallback, boolean allowSave ) {
		CFBamJavaFXStringTypeAddForm retnew = new CFBamJavaFXStringTypeAddForm( formManager, javafxSchema, argFocus, closeCallback, allowSave );
		return( retnew );
	}

	public CFBorderPane newViewEditForm( ICFFormManager formManager, ICFBamStringTypeObj argFocus, ICFFormClosedCallback closeCallback, boolean cameFromAdd ) {
		CFBamJavaFXStringTypeViewEditForm retnew = new CFBamJavaFXStringTypeViewEditForm( formManager, javafxSchema, argFocus, closeCallback, cameFromAdd );
		return( retnew );
	}
}
