# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Implement the ROS middleware interface using PrismTech OpenSplice static code generation in C++."
AUTHOR = "Dirk Thomas <dthomas@osrfoundation.org>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

ROS_BUILD_DEPENDS = " \
    rcutils \
    rmw \
    rosidl-generator-c \
    rosidl-generator-cpp \
    rosidl-generator-dds-idl \
    rosidl-typesupport-opensplice-c \
    rosidl-typesupport-opensplice-cpp \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
    opensplice-cmake-module-native \
    rosidl-cmake-native \
"

ROS_EXPORT_DEPENDS = " \
    rosidl-generator-c \
    rosidl-generator-cpp \
    rosidl-typesupport-opensplice-c \
    rosidl-typesupport-opensplice-cpp \
"

ROS_BUILDTOOL_EXPORT_DEPENDS = " \
    ament-cmake-native \
    opensplice-cmake-module-native \
    rosidl-cmake-native \
"

ROS_EXEC_DEPENDS = " \
    rmw \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-lint-auto \
    ament-lint-common \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/ros2-gbp/rmw_opensplice-release/archive/release/crystal/rmw_opensplice_cpp/0.6.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "d0b0daf66b110d1dcbeec8bfd3fc730f"
SRC_URI[sha256sum] = "6d86a8b9e2e0aab9e2a58fd3eec8c9463dba0a95e21bae0ea5a9aeb9b03737d6"
S = "${WORKDIR}/rmw_opensplice-release-release-crystal-rmw_opensplice_cpp-0.6.3-0"

ROS_BUILD_TYPE = "ament_cmake"
ROS_RECIPES_TREE = "recipes-ros2"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/rmw-opensplice/rmw-opensplice_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/rmw-opensplice/rmw-opensplice_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/rmw-opensplice/rmw-opensplice-${PV}_common.inc

inherit ros_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}

