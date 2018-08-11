# Copyright 2018 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "TLSF allocator version 2.4.6"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "bouncy"
LICENSE = "LGPL-2.1"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=3badeab1074cb0c993003745c15d12f0"

DEPENDS = "ament-cmake"
SRC_URI = "https://github.com/ros2-gbp/${PN}-release/archive/release/bouncy/${PN}/0.5.0-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "2cfee668d0800cf38958bd5db390b122"
SRC_URI[sha256sum] = "5890f4cebf87cb7235174541786c815c0438e3400cb382e2e41b3992bf3830ad"
S = "${WORKDIR}/${PN}-release-release-bouncy-${PN}-0.5.0-0"

inherit catkin
