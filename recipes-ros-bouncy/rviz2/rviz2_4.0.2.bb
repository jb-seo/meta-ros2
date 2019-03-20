# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "3D visualization tool for ROS."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "rviz-common rviz-default-plugins rviz-ogre-vendor qtbase5-dev"
SRC_URI = "https://github.com/ros2-gbp/rviz-release/archive/release/bouncy/${PN}/4.0.2-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "edebffe9ff7a5e957ce5fa0be299e817"
SRC_URI[sha256sum] = "9003cd0366dbe169ed0fa031995bc3fb6dc9b15940c95a51000457e71f8a817e"
S = "${WORKDIR}/rviz-release-release-bouncy-${PN}-4.0.2-0"


inherit ros
inherit ament

