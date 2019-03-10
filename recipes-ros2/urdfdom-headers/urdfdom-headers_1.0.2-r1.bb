# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "C++ headers for URDF."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "cmake"
SRC_URI = "https://github.com/ros2-gbp/urdfdom_headers-release/archive/release/crystal/urdfdom_headers/1.0.2-1.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "25c60fc2b4c9d18021bc0cdebba8bfa5"
SRC_URI[sha256sum] = "57ca69ecd0c2de926bc758d5f7a32dce4cd2ebc7f902c69b22ee34f9647e62fa"
S = "${WORKDIR}/urdfdom_headers-release-release-crystal-urdfdom_headers-1.0.2-1"

inherit catkin
