# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Testing tools for C++, and is used in various OSRF projects."
AUTHOR = "William Woodall <william@osrfoundation.org>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_BUILD_DEPENDS = ""

ROS_BUILDTOOL_DEPENDS = " \
    cmake-native \
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

SRC_URI = "https://github.com/ros2-gbp/osrf_testings_tools_cpp-release/archive/release/crystal/osrf_testing_tools_cpp/1.1.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "716f35c08e31dc56e14f93e237c2f676"
SRC_URI[sha256sum] = "853939b29d8c0e8889459cd6bb22fdd69cba853bfaf2099bd4ae5a1b18ba235b"
S = "${WORKDIR}/osrf_testings_tools_cpp-release-release-crystal-osrf_testing_tools_cpp-1.1.0-0"

ROS_BUILD_TYPE = "cmake"
ROS_RECIPES_TREE = "recipes-ros2"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/osrf-testing-tools-cpp/osrf-testing-tools-cpp_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/osrf-testing-tools-cpp/osrf-testing-tools-cpp_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/osrf-testing-tools-cpp/osrf-testing-tools-cpp-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/osrf-testing-tools-cpp/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/osrf-testing-tools-cpp/${BPN}-${PV}.inc

inherit ros_superflore_generated
inherit ros_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}