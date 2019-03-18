# Copyright 2019 Open Source Robotics Foundation
# Distributed under the terms of the BSD license

DESCRIPTION = "voxel_grid provides an implementation of an efficient 3D voxel grid. The occupancy grid can support 3 different representations for the state of a cell: marked, free, or unknown. Due to the underlying implementation relying on bitwise and and or integer operations, the voxel grid only supports 16 different levels per voxel column. However, this limitation yields raytracing and cell marking performance in the grid comparable to standard 2D structures making it quite fast compared to most 3D structures."
AUTHOR = "OSRF"
SECTION = "devel"
ROSDISTRO = "crystal"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = " rclcpp"
SRC_URI = "https://github.com/SteveMacenski/navigation2-release/archive/release/crystal/nav2_voxel_grid/0.1.5-0.tar.gz;downloadfilename=${ROS_SP}.tar.gz"

SRC_URI[md5sum] = "cb6d4110871284d40ea89a96367922a8"
SRC_URI[sha256sum] = "b492f414d89a8062c3dfd58631867641dcf0e16cce674deaf2328c114c4aded7"
S = "${WORKDIR}/navigation2-release-release-crystal-nav2_voxel_grid-0.1.5-0"

inherit ament
