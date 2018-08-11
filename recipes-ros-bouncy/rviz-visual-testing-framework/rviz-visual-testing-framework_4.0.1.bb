# Copyright 2018 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "3D testing framework for RViz."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "ament-cmake ament-cmake-gtest qtbase5-dev rviz-common"
SRC_URI = "https://github.com/ros2-gbp/rviz-release/archive/release/bouncy/rviz_visual_testing_framework/4.0.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "9f7582aee4e9e23993ce9c3829b09e36"
SRC_URI[sha256sum] = "4da1af6ff97b81b77fb4c93f56a566690d7dc3d671ccc04510c8bd08e6884c9c"
S = "${WORKDIR}/rviz-release-release-bouncy-rviz_visual_testing_framework-4.0.1-0"

inherit catkin
