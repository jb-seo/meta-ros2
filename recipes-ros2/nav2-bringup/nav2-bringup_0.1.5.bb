# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Bringup scripts and configurations for the navigation2 stack"
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = " launch-ros navigation2"
SRC_URI = "https://github.com/SteveMacenski/navigation2-release/archive/release/crystal/nav2_bringup/0.1.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "c2a9526c12ece932e0b952da6765caa2"
SRC_URI[sha256sum] = "6c8c985c83a5380e2d9183faa58bb6ae59b79309354ec6e4fc92df7046246808"
S = "${WORKDIR}/navigation2-release-release-crystal-nav2_bringup-0.1.5-0"

inherit ament
