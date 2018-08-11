# Copyright 2018 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "3D visualization tool for ROS."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "ament-cmake qtbase5-dev rviz-common rviz-default-plugins rviz-ogre-vendor"
SRC_URI = "https://github.com/ros2-gbp/rviz-release/archive/release/bouncy/${PN}/4.0.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "e52aab6ccc13e0329e943d0e95946641"
SRC_URI[sha256sum] = "b95eaae17a4b6191424d9c79fa52aca6e35be500279530185c1d7c892797fb31"
S = "${WORKDIR}/rviz-release-release-bouncy-${PN}-4.0.1-0"

inherit catkin
