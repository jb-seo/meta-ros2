# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "3D visualization tool for ROS."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = " qtbase5-dev rviz-common rviz-default-plugins rviz-ogre-vendor"
SRC_URI = "https://github.com/ros2-gbp/rviz-release/archive/release/crystal/${PN}/5.1.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "2054d2a5e8b25cdeb639c13edc4e243a"
SRC_URI[sha256sum] = "152a838d3f477c960cf567c50e70ba0cec5645c2bbb881a0cda952ccb2ddd4b8"
S = "${WORKDIR}/rviz-release-release-crystal-${PN}-5.1.0-0"

inherit ament
