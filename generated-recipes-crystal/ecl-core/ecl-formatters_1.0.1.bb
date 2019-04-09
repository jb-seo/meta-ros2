# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "The formatters here simply format various input types to a specified    text format. They can be used with most streaming types (including both    ecl and stl streams)."
AUTHOR = "Daniel Stonier <d.stonier@gmail.com>"
HOMEPAGE = "http://wiki.ros.org/ecl_formatters"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_BUILD_DEPENDS = " \
    ecl-build \
    ecl-config \
    ecl-converters \
    ecl-exceptions \
    ecl-license \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-ros-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = ""

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = ""

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/yujinrobot-release/ecl_core-release/archive/release/crystal/ecl_formatters/1.0.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "8fe6e0015f54259e749857a617ff0223"
SRC_URI[sha256sum] = "b965714bbb869bbbfe9ecf925fa6e2f6e1275d8ff764f9e8f93110a00609cbe0"
S = "${WORKDIR}/ecl_core-release-release-crystal-ecl_formatters-1.0.1-0"

ROS_BUILD_TYPE = "ament_cmake"
ROS_RECIPES_TREE = "recipes-ros2"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/ecl-core/ecl-core_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/ecl-core/ecl-core_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/ecl-core/ecl-core-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/ecl-core/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/ecl-core/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}
