# Generated by superflore -- DO NOT EDIT
#
# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "TODO"
AUTHOR = "Carl Delsey <carl.r.delsey@intel.com>"
HOMEPAGE = "https://wiki.ros.org"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

ROS_BUILD_DEPENDS = " \
    dwb-msgs \
    geometry-msgs \
    nav2-costmap-2d \
    nav-2d-msgs \
    nav-2d-utils \
    nav-msgs \
    pluginlib \
    rclcpp \
    sensor-msgs \
    std-msgs \
    tf2-ros \
    visualization-msgs \
"

ROS_BUILDTOOL_DEPENDS = " \
    ament-cmake-native \
"

ROS_EXPORT_DEPENDS = ""

ROS_BUILDTOOL_EXPORT_DEPENDS = ""

ROS_EXEC_DEPENDS = " \
    dwb-msgs \
    geometry-msgs \
    nav2-costmap-2d \
    nav-2d-utils \
    nav-msgs \
    pluginlib \
    rclcpp \
    std-msgs \
    tf2-ros \
"

# Currently informational only -- see http://www.ros.org/reps/rep-0149.html#dependency-tags.
ROS_TEST_DEPENDS = " \
    ament-cmake-gtest \
    ament-cmake-pytest \
    ament-lint-auto \
    ament-lint-common \
    launch \
    launch-testing \
"

DEPENDS = "${ROS_BUILD_DEPENDS} ${ROS_BUILDTOOL_DEPENDS}"
# Bitbake doesn't support the "export" concept, so build them as if we needed them to build this package (even though we actually
# don't) so that they're guaranteed to have been staged should this package appear in another's DEPENDS.
DEPENDS += "${ROS_EXPORT_DEPENDS} ${ROS_BUILDTOOL_EXPORT_DEPENDS}"

RDEPENDS_${PN} += "${ROS_EXEC_DEPENDS}"

SRC_URI = "https://github.com/SteveMacenski/navigation2-release/archive/release/crystal/dwb_core/0.1.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "e2150a3f7cb635f939923906912c9153"
SRC_URI[sha256sum] = "998ade93f1f65c201df00793760c524ee4a152ea2925c06cbe01822c54e130d7"
S = "${WORKDIR}/navigation2-release-release-crystal-dwb_core-0.1.5-0"

ROS_BUILD_TYPE = "ament_cmake"
ROS_RECIPES_TREE = "recipes-ros2"

# Allow the above settings to be overridden.
include ${ROS_LAYERDIR}/recipes-ros/navigation2/navigation2_common.inc
include ${ROS_LAYERDIR}/recipes-ros2/navigation2/navigation2_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/navigation2/navigation2-${PV}_common.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/navigation2/${BPN}.inc
include ${ROS_LAYERDIR}/${ROS_RECIPES_TREE}/navigation2/${BPN}-${PV}.inc

inherit ros_${ROS_DISTRO}
inherit ros_${ROS_BUILD_TYPE}

