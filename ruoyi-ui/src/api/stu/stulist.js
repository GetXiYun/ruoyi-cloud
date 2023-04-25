import request from '@/utils/request'

// 查询学生信息列表
export function listStulist(query) {
  return request({
    url: '/stu/stulist/list',
    method: 'get',
    params: query
  })
}

// 查询学生信息详细
export function getStulist(id) {
  return request({
    url: '/stu/stulist/' + id,
    method: 'get'
  })
}

// 新增学生信息
export function addStulist(data) {
  return request({
    url: '/stu/stulist',
    method: 'post',
    data: data
  })
}

// 修改学生信息
export function updateStulist(data) {
  return request({
    url: '/stu/stulist',
    method: 'put',
    data: data
  })
}

// 删除学生信息
export function delStulist(id) {
  return request({
    url: '/stu/stulist/' + id,
    method: 'delete'
  })
}
