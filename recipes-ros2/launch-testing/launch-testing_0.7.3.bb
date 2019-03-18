# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Helper scripts for tests that use the ROS launch tool."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = " launch"
SRC_URI = "https://github.com/ros2-gbp/launch-release/archive/release/crystal/launch_testing/0.7.3-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "5c2d075a0c3415e1496f4c9ed67dcf51"
SRC_URI[sha256sum] = "d73dc1f4e6c3be410dbed78214e13679c3079361f1f632890611cd1858248045"
S = "${WORKDIR}/launch-release-release-crystal-launch_testing-0.7.3-0"

inherit ament
