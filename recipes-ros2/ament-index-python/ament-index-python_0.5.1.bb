# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "Python API to access the ament resource index."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=12c26a18c7f493fdc7e8a93b16b7c04f"

DEPENDS = ""
SRC_URI = "https://github.com/ros2-gbp/ament_index-release/archive/release/crystal/ament_index_python/0.5.1-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "5164bd1f0c7f0a4f73471bac65deed79"
SRC_URI[sha256sum] = "2c72c61f27599e5d25900d22ad6e70116552e5eea1570e00b519b5b2d730a97e"
S = "${WORKDIR}/ament_index-release-release-crystal-ament_index_python-0.5.1-0"

inherit catkin
