# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "A handful of useful utility functions for nav_2d packages."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "ament-cmake geometry-msgs nav2-msgs nav-2d-msgs nav-msgs tf2 tf2-geometry-msgs"
SRC_URI = "https://github.com/SteveMacenski/navigation2-release/archive/release/crystal/nav_2d_utils/0.1.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "d78d6519aa14534e501f90f671be798f"
SRC_URI[sha256sum] = "c8c20e78ca4881dbe366a85ab6da5ec6fe8212adc4fd1eb6a3926f01a5fcd0b4"
S = "${WORKDIR}/navigation2-release-release-crystal-nav_2d_utils-0.1.5-0"

inherit catkin
